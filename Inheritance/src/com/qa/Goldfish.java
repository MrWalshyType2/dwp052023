package com.qa;

public class Goldfish extends AquaticAnimal {
    public Goldfish(String name) {
        super(name);
        // the super() constructor call can only appear
        // on the first line of a constructor. It calls
        // a constructor in the parent class which matches
        // the parameter types
    }
}
