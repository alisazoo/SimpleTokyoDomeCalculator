package com.example.SimpleTokyoDomeCalculator.controller;

import com.example.SimpleTokyoDomeCalculator.domain.Place;
import com.example.SimpleTokyoDomeCalculator.repository.PlaceRepository;
import com.example.SimpleTokyoDomeCalculator.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Controller
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    private final static int tokyodome = 46755;

    @GetMapping("/")
    public String showList(Model model){
        model.addAttribute("places", placeService.getAllPlaces());
        return "index";
    }

    @GetMapping("/new")
    public String addPlace(@ModelAttribute Place place){
        return "create_place";
    }

    @PostMapping("/")
    public String savePlace(@Validated @ModelAttribute Place place,
                            BindingResult result){
        if(result.hasErrors()){
            return "index";
        }
        place.setResult(calcResult(place));
        placeService.savePlace(place);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editPlace(@PathVariable Long id, Model model){
        model.addAttribute("place", placeService.getPlaceById(id));
        return "edit_place";
    }

    @PostMapping("/{id}")
    public String updatePlace(@PathVariable Long id,
                              @ModelAttribute Place place,
                              Model model){

        Place existingPlace = placeService.getPlaceById(id);
        existingPlace.setId(id);
        existingPlace.setName(place.getName());
        existingPlace.setArea(place.getArea());
        existingPlace.setResult(calcResult(place));

        placeService.updatePlace(existingPlace);
        // TODO Cannot resolve controller URL'/place_list'
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String deletePlace(@PathVariable Long id){
        placeService.deletePlaceById(id);
        return "redirect:/";
    }

    public static Double calcResult(Place place){

        // Check the validity of the input:
        // whether it is not null or is Integer
        boolean isValid = false;
        Integer inputArea = place.getArea();
        // todo: check whether it is need to check the type
        if(inputArea != null){
            isValid = true;
        }

        if(isValid){
            // use BigDecimal 小数点第二位まで表示、四捨五入
            BigDecimal inputAreaBD = new BigDecimal(inputArea);
            BigDecimal tokyoDomeBD = new BigDecimal(tokyodome);
            BigDecimal resultBD = inputAreaBD.divide(
                    tokyoDomeBD, 2, RoundingMode.HALF_EVEN);
            return resultBD.doubleValue();
        } else{
            place.setResult(null);  // Reset the result
            return null;
        }
    }

}
