package com.example.myFirstSpringBootCar.services;

import com.example.myFirstSpringBootCar.models.CarTable;

public interface CarServices {
    public CarTable createCarTable(CarTable carTable);

    public Iterable<CarTable> listCars();
}
