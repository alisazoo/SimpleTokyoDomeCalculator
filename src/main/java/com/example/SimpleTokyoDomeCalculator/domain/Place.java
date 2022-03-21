package com.example.SimpleTokyoDomeCalculator.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Min(value=0)
    private Integer area;

    private Double result;

    public Place() {
    }

    public Place(String name, Integer area) {
        this.name = name;
        this.area = area;
    }
}
