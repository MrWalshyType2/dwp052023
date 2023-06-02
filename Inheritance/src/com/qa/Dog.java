package com.qa;

// Dog is a subclass of Animal
// Animal is the superclass of Dog
// - Dog inherits non-private fields and methods
public class Dog extends Animal {

    // getName() and setName(String name) are inherited
    // from Animal as they are both public methods

    // String name; the field is not inherited as it is private.

    // We can override inherited methods, we can change their behaviour
    @Override
    public void noise() {
        System.out.println("Woof");
    }
}
