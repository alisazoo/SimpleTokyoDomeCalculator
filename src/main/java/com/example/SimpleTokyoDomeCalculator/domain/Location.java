package com.example.SimpleTokyoDomeCalculator.domain;

import javax.persistence.*;

@Entity
@Table(name="location")
public class Location {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(
            name = "location_sequence",
            sequenceName = "location_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "location_sequence"
    )
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name="width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @Column(name = "area", nullable = false)
    private Integer area;

    public Location() {
    }

    public Location(String name, Integer width, Integer height, Integer area) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.area = area;
    }

}
