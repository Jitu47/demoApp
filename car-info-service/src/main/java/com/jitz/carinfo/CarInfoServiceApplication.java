package com.jitz.carinfo;

import com.jitz.carinfo.domain.Car;
import com.jitz.carinfo.domain.CarRepository;
import com.jitz.carinfo.domain.Owner;
import com.jitz.carinfo.domain.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class CarInfoServiceApplication {

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(CarInfoServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			Owner owner1 = new Owner("Bruce" , "Wayne");
			Owner owner2 = new Owner("Clark" , "Kent");
			ownerRepository.save(owner1);
			ownerRepository.save(owner2);
			carRepository.save(new Car("Ford", "Mushtang", "Red", "ADF-3212", 2444, 2018, owner2));
			carRepository.save(new Car("BMW", "X5", "Black", "BM-43343", 6777, 2016, owner1));
			carRepository.save(new Car("Mercedes", "S", "Silver", "ME-35345", 3433, 2018, owner1));
			carRepository.save(new Car("Audi", "A8", "Blue", "AU-653453", 5653, 2018, owner1));
		};
	}

	
}
