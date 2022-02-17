package com.example.SimpleTokyoDomeCalculator.service;

import com.example.SimpleTokyoDomeCalculator.domain.Place;
import com.example.SimpleTokyoDomeCalculator.repository.PlaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {

    private PlaceRepository placeRepository;

    public PlaceServiceImpl(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Override
    public List<Place> getAllPlaces() {
        System.out.println("placeServiceImpl: getAllPlaces");
        return placeRepository.findAll();
    }

    @Override
    public Place savePlace(Place place) {
        System.out.println("placeServiceImpl: savePlace");

        return placeRepository.save(place);
    }

    @Override
    public Place getPlaceById(Long id) {
        System.out.println("placeServiceImpl: getPlaceById");
        // TODO: Optional.get() without isPresent() check
        return placeRepository.findById(id).get();
    }

    @Override
    public Place updatePlace(Place place) {

        System.out.println("placeServiceImpl: updatePlace");
        return placeRepository.save(place);
    }

    @Override
    public void deletePlaceById(Long id) {
        System.out.println("placeServiceImpl: deleteByIdPlace");
        placeRepository.deleteById(id);

    }
}
