package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String brand;
    private int year;
    private double price;

    public Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    // Геттеры и сеттеры для полей

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

