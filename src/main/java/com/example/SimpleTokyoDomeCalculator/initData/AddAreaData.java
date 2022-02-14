package com.example.SimpleTokyoDomeCalculator.initData;

import com.example.SimpleTokyoDomeCalculator.domain.Place;
import com.example.SimpleTokyoDomeCalculator.repository.PlaceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AddAreaData implements CommandLineRunner {

    private final PlaceRepository placeRepository;

    public AddAreaData(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Initialise data...................");

        Place place = new Place("Park A", 1235);
        placeRepository.save(place);

        System.out.println("Number of the place"+ placeRepository.count());

    }
}
