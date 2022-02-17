package com.example.SimpleTokyoDomeCalculator.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Entity
@Table(name = "places")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "area")
    private Double area;

    @Column(name = "result")
    private Double result;

    public Place() {
    }

    public Place(String name, Double area) {
        this.name = name;
        this.area = area;
//        if(result != null)
//            this.result = result;
//        else

//            this.result = (area / tokyodome);

//        Double temp_result = area/tokyodome;
//        BigDecimal bd = new BigDecimal(temp_result).setScale(2, RoundingMode.HALF_UP);
//        this.result = bd.doubleValue();
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

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getResult() {
//        System.out.println("BigDecimal");
//        BigDecimal bd = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
//        Double result2 = bd.doubleValue();
//        System.out.println(result2);
        return result;
    }

    public void setResult(Double result) {
        //TODO Replace condition with Objects.requireNonNullElseGet
//        if(result != null)
            this.result = result;
//        else
//            this.result = area / tokyodome;
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
                ", area=" + area +
                ", result=" + result +
                '}';
    }
}