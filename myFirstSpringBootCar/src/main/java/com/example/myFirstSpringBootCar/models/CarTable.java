package com.example.myFirstSpringBootCar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "my_cars")
public class CarTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long carid;

    @Column
    private String carMake;

    @Column
    private String carModel;

    @Column
    private int carYear;

    public CarTable() { }

    public void setCarid(long carid) {
        this.carid = carid;
    }

    public long getCarid() {
        return carid;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }


    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public int getCarYear() {
        return carYear;
    }
}
