package com.example.myFirstSpringBootCar.repository;

import com.example.myFirstSpringBootCar.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
