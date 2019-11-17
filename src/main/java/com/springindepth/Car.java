package com.springindepth;

/**
 * @author 58212
 * @date 2019-11-17 22:04
 */
public class Car {

    private String brand;

    private String corp;

    private int price;

    private double maxSpeed;

    public Car(String brand, String corp, int price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, String corp, double maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
    }
}
