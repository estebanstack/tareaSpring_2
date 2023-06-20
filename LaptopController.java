package com.example.LaptopExercise.Controllers;

import com.example.LaptopExercise.Entities.Laptop;
import com.example.LaptopExercise.Repositories.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    private final LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository){
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    @GetMapping("api/laptops/{id}")
    public ResponseEntity<Laptop> findById(@PathVariable Long id){
       Optional<Laptop> laptopOptional = laptopRepository.findById(id);

       return laptopOptional.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }

    @PostMapping("/api/laptops")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){
        return ResponseEntity.ok(laptopRepository.save(laptop));
    }


}
