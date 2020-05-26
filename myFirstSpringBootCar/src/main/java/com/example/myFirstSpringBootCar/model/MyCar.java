package com.example.myFirstSpringBootCar.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Table(name = "my_cars")
public class MyCar {

    @Id
    @GeneratedValue
    @Column(name = "car_id")
    private long id;


    @Column(name = "car_make")
    private String carMake;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_year")
    private Long carYear;

    public MyCar() {
        super();
    }


    public MyCar(long id, String carMake, Long carYear, String carModel) {
        this.id = id;
        this.carMake = carMake;
        this.carYear = carYear;
        this.carModel = carModel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public Long getCarYear() {
        return carYear;
    }

    public void setCarYear(Long carYear) {
        this.carYear = carYear;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
