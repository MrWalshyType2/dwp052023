package com.qa;

public class AquaticAnimal extends Animal {

    // Because there is no zero-argument constructor,
    // classes which inherit from AquaticAnimal
    // will need to implement their own

    public AquaticAnimal(String name) {
        // call the inherited setName() method to set the value
        // of the name field in Animal
        setName(name);
    }
}
