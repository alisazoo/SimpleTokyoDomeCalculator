package com.example.SimpleTokyoDomeCalculator.controller;

import com.example.SimpleTokyoDomeCalculator.domain.Place;
import com.example.SimpleTokyoDomeCalculator.repository.PlaceRepository;
import com.example.SimpleTokyoDomeCalculator.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Controller
//@RestController
//@RequestMapping(path = "/")
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    private static int tokyodome = 46755;

    public static double calcResult(Place place){
        double area = place.getArea();
        double temp_result = area/tokyodome;
        BigDecimal bd = new BigDecimal(temp_result)
                .setScale(2, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }

    @GetMapping("/place_list")
    public String listPlaces(Model model){
        model.addAttribute(
                "places", placeService.getAllPlaces());
        return "place_list";
    }

    @GetMapping("place_list/new")
    public String createPlaceForm(Model model){
        // Create Place object to hold Place from data
        Place place = new Place();
        model.addAttribute("place", place);
        return "create_place";
    }

    @PostMapping("/place_list")
    public String savePlace(@ModelAttribute("place") Place place){
        place.setResult(calcResult(place));
        placeService.savePlace(place);
        return "redirect:/place_list";
    }

    @GetMapping("/place_list/edit/{id}")
    public String editPlaceForm(@PathVariable Long id, Model model){
        model.addAttribute("place", placeService.getPlaceById(id));
        return "edit_place";
    }

    @PostMapping("/place_list/{id}")
    public String updatePlace(@PathVariable Long id,
                              @ModelAttribute("place") Place place,
                              Model model){

        Place existingPlace = placeService.getPlaceById(id);
        existingPlace.setId(id);
        existingPlace.setName(place.getName());
        existingPlace.setArea(place.getArea());
        existingPlace.setResult(calcResult(place));

        placeService.updatePlace(existingPlace);
        return "redirect:/place_list";
    }

    @GetMapping("/place_list/{id}")
    public String deletePlace(@PathVariable Long id){
        placeService.deletePlaceById(id);
        return "redirect:/place_list";
    }

}
