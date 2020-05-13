package com.jitz.carinfo.web;

import com.jitz.carinfo.domain.Car;
import com.jitz.carinfo.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarInfoController {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars(){
        return carRepository.findAll();
    }

    @DeleteMapping(value = "/cars/{id}")
    public String deleteCar(@PathVariable Long id){
        try{
            carRepository.delete(carRepository.findById(id).get());
            return "Car with id:" + id + " deleted";
        }
        catch(ResourceNotFoundException ex){
            return "Car with id:" + id + "not found";
        }
    }

    @PostMapping(value = "cars/add-car")
    public Car addCar(@RequestBody Car car){
        return carRepository.save(car);
    }


}
