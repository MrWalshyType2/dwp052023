package com.qa;

// Animal will be the supertype class of all animals
public class Animal {

    public Animal() {
        super();
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void noise() {}
}
