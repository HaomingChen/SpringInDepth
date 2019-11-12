package com.springindepth;

/**
 * Hello world!
 */
public class HelloWorld {
    String name;

    public void hello() {
        System.out.println("Hello " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
