package com.example.myFirstSpringBootCar.controller;

import com.example.myFirstSpringBootCar.exceptions.ResourcesNotFoundException;
import com.example.myFirstSpringBootCar.model.MyCar;
import com.example.myFirstSpringBootCar.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/my_cars_api/v1")
public class CarController {

    @Autowired
    private CarRepository carRepository;
    //  get all cars
    @GetMapping("/urcars")
    public List<MyCar> getAllCars(Model model) {
        return this.carRepository.findAll();
    }


//  get all cars by id

    @GetMapping("/urcars/{id}")
    public ResponseEntity<MyCar> getCarById(@PathVariable(value = "id") Long carId)
            throws ResourcesNotFoundException {
        MyCar myCar = carRepository.findById(carId)
                .orElseThrow(() -> new ResourcesNotFoundException("MyCar not found for this id :: " + carId));
        return ResponseEntity.ok().body(myCar);
    }

//  save cars

    @PostMapping("/urcars")
    public MyCar createEmployee(@Valid @RequestBody MyCar myCar) {
        return carRepository.save(myCar);
    }
//  Update Cars

    @PutMapping("/urcars/{id}")
    public ResponseEntity<MyCar> updateCar(@PathVariable(value = "id") Long carId,
                                                @Valid @RequestBody MyCar myCarDetails)
            throws ResourcesNotFoundException {
        MyCar myCar = carRepository.findById(carId)
                .orElseThrow(()-> new ResourcesNotFoundException("MyCar not found for this id :: " + carId));


        myCar.setCarMake(myCarDetails.getCarMake());
        myCar.setCarModel(myCarDetails.getCarModel());
        myCar.setCarYear(myCarDetails.getCarYear());


        final MyCar updatedMyCar = carRepository.save(myCar);


        return ResponseEntity.ok(updatedMyCar);

    }

//  Delete MyCar

    @DeleteMapping("/urcars/{id}")
    public Map<String, Boolean> deletedEmployee(@PathVariable(value = "id") Long carId)
            throws ResourcesNotFoundException {
        MyCar myCar = carRepository.findById(carId)
                .orElseThrow(()-> new ResourcesNotFoundException("MyCar not found for this id :: " + carId));

        carRepository.delete(myCar);
        Map<String, Boolean> response = new HashMap<>();

        response.put("deleted myCar", Boolean.TRUE);

        return response;

    }

}
