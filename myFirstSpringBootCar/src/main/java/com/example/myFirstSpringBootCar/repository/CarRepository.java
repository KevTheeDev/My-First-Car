package com.example.myFirstSpringBootCar.repository;

import com.example.myFirstSpringBootCar.models.CarTable;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<CarTable, Long> {
}
