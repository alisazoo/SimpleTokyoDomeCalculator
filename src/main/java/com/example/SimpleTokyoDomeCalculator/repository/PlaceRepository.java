package com.example.SimpleTokyoDomeCalculator.repository;

import com.example.SimpleTokyoDomeCalculator.domain.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
