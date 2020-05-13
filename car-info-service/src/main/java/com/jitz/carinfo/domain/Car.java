package com.jitz.carinfo.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //The AUTO type means that the JPA provider selects the best strategy for a particular database
    private long id;
    private String brand, model, color, registerationNumber;
    private int price, year;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner")
    private Owner owner;

    public Car (){

    }

    public Car(String brand, String model, String color, String registerationNumber, int price, int year, Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerationNumber = registerationNumber;
        this.price = price;
        this.year = year;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegisterationNumber() {
        return registerationNumber;
    }

    public void setRegisterationNumber(String registerationNumber) {
        this.registerationNumber = registerationNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Owner getOwners() {
        return owner;
    }

    public void setOwners(Owner owner) {
        this.owner = owner;
    }
}
