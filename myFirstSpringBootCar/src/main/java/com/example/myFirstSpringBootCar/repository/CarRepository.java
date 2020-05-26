package com.example.myFirstSpringBootCar.repository;

import com.example.myFirstSpringBootCar.model.MyCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface CarRepository extends JpaRepository<MyCar, Long> {



}
