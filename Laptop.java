package com.example.LaptopExercise.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String CPU;
    private boolean windows11;
    private LocalDate releaseDate;

    public Laptop() { }

    public Laptop(Long id, String brand, String model, String CPU, boolean windows11, LocalDate releaseDate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.CPU = CPU;
        this.windows11 = windows11;
        this.releaseDate = releaseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public boolean isWindows11() {
        return windows11;
    }

    public void setWindows11(boolean windows11) {
        this.windows11 = windows11;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
