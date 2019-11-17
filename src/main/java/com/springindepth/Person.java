package com.springindepth;

/**
 * @author 58212
 * @date 2019-11-17 22:33
 */
public class Person {
    private String name;
    private int age;
    private Car car;

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age + " Car: " + car;
    }
}
