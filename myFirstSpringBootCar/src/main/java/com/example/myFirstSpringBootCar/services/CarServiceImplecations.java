package com.example.myFirstSpringBootCar.services;


import com.example.myFirstSpringBootCar.models.CarTable;
import com.example.myFirstSpringBootCar.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImplecations {
    @Autowired
    private CarRepository carRepository;

    @Override
    public CarTable createCar(CarTable carTable){
        return carRepository.save(carTable);
    }

    @Override
    public Iterable<CarTable> list() {
        return carRepository.findAll();
    }

}
