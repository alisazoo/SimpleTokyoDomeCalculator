package com.example.SimpleTokyoDomeCalculator.controller;

import com.example.SimpleTokyoDomeCalculator.domain.Place;
import com.example.SimpleTokyoDomeCalculator.repository.PlaceRepository;
import com.example.SimpleTokyoDomeCalculator.service.PlaceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@RequestMapping(path = "/")
public class PlaceController {

    private PlaceService placeService;
    private PlaceRepository placeRepository;

    public PlaceController(PlaceService placeService, PlaceRepository placeRepository) {
        this.placeService = placeService;
        this.placeRepository = placeRepository;
    }

    @GetMapping("/places")
    public String getPlaces(Model model){
        model.addAttribute("places", placeRepository.findAll());
        return "place_list";
    }
//    // Handler method to handle list Places and return mode and view
//    @GetMapping("/places")
//    public String listPlaces(Model model){
//        model.addAttribute("places", placeService.getAllPlaces());
//        return "places";
//    }
//
//    @GetMapping("places/new")
//    public String createPlaceForm(Model model){
//        // Create Place object to hold Place from data
//        Place place = new Place();
//        model.addAttribute("place", place);
//        return "create_place";
//    }
//
//    @PostMapping("/places")
//    public String savePlace(@ModelAttribute("place") Place place){
//        placeService.savePlace(place);
//        return "redirect:/places";
//    }
//
//    @GetMapping("/places/edit/{id}")
//    public String editPlaceForm(@PathVariable Long id, Model model){
//        model.addAttribute("place", placeService.getPlaceById(id));
//        return "edit_place";
//    }
//
//    @PostMapping("/places/{id}")
//    public String updatePlace(@PathVariable Long id,
//                              @ModelAttribute("place") Place place,
//                              Model model){
//        // get place from DB by id
//
//        // Case1: register name & area
//        Place existingPlace = placeService.getPlaceById(id);
//        existingPlace.setId(id);
//        existingPlace.setName(place.getName());
//        existingPlace.setArea(place.getArea());
//
//        //TODO: Add the following cases
//        // Case2: register name, height, and width
//        // Case3: register the whole except id
//
//        // Save updated place object
//        placeService.updatePlace(existingPlace);
//
//        return "redirect:/places";
//    }
//
//    @GetMapping("/places/{id}")
//    public String deletePlace(@PathVariable Long id){
//        placeService.deletePlaceById(id);
//        return "redirect:/places";
//    }

}
