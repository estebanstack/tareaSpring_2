package com.example.LaptopExercise;

import com.example.LaptopExercise.Entities.Laptop;
import com.example.LaptopExercise.Repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class LaptopExerciseApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LaptopExerciseApplication.class, args);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		Laptop laptop = new Laptop(null,"hp", "notebook", "Intel i3", true,
				LocalDate.of(2015, 12, 10));

		laptopRepository.save(laptop);
	}

}
