package com.example.SimpleTokyoDomeCalculator.service;

import com.example.SimpleTokyoDomeCalculator.domain.Place;

import java.util.List;

public interface PlaceService {
    List<Place> getAllPlaces();

    Place savePlace(Place place);

    Place getPlaceById(Long id);

    Place updatePlace(Place place);

    void deletePlaceById(Long id);
}
