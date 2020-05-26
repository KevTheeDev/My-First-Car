package com.example.myFirstSpringBootCar.controller;


import com.example.myFirstSpringBootCar.models.CarTable;
import com.example.myFirstSpringBootCar.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/my_cars")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/my_cars")
    public Iterable<CarTable> listCarTable(){
        return CarService.listCarTable();
    }

    @PostMapping("/my_cars")
    public CarTable createCarTable(@RequestBody CarTable carTable) {
        return carService.createCarTable(carTable);
    }
}
