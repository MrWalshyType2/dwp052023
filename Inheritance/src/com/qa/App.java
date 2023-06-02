package com.qa;

public class App {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.setName("Terry");
        System.out.println(a.getName());
        a.noise();

        Animal doggo = new Dog();
        // subtype polymorphism allows us to put a subclass in a parent class
        // variable,
        doggo.setName("Joey");
        System.out.println(doggo.getName());
        doggo.noise();

        AquaticAnimal aquatic = new AquaticAnimal("Jerry the Goldfish");
        System.out.println(aquatic.getName());

        Goldfish jerrysClone = new Goldfish("Jerry the clone");
        System.out.println(jerrysClone.getName());
    }
}
