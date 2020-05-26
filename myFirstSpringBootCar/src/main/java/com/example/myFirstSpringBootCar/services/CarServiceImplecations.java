package com.example.myFirstSpringBootCar.services;


import com.example.myFirstSpringBootCar.models.CarTable;
import com.example.myFirstSpringBootCar.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImplecations implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public CarTable createCarTable(CarTable carTable){
        return carRepository.save(carTable);
    }

//    @Override
//    public Iterable<CarTable> listCarTable() {
//        return carRepository.findAll();
//    }

}
