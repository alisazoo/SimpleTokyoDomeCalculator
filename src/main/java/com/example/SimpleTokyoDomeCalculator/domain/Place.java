package com.example.SimpleTokyoDomeCalculator.domain;

import javax.persistence.*;

@Entity
//@Table(name="place")
@Table
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(
//            name = "place_sequence",
//            sequenceName = "place_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "place_sequence"
//    )
    private Long id;

//    @Column(name = "name", nullable = false)
    private String name;

//    @Column(name="width")
    private Integer width;

//    @Column(name = "length")
    private Integer length;

//    @Column(name = "area")
    private Integer area;

    public Place() {
    }

    public Place(String name, Integer width, Integer length, Integer area) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.area = area;
    }

    public Place(String name, Integer width, Integer length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public Place(String name, Integer area) {
        this.name = name;
        this.area = area;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        if(area==null && (length != null & width != null))
            this.area = length * width;
        else
            this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Place place = (Place) o;

        return id != null ? id.equals(place.id) : place.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", area=" + area +
                '}';
    }
}
