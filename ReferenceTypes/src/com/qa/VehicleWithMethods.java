package com.qa;

public class VehicleWithMethods {

    // the private access modifier means
    // these fields can only be accessed inside this
    // class
    // - we should make fields privates by default
    private String manufacturer;
    private int yearOfProduction;

    // public means the method is accessible anywhere
    // String is the return type
    // getManufacturer is the name
    // the return keyword is used to return a value
    public String getManufacturer() {
        return manufacturer;
    }

    // void means returns nothing
    // we also have 1 parameter, of type string
    public void setManufacturer(String input) {
        manufacturer = input;
    }

    // There is a special method that all objects in
    // Java do have, it is called toString(). It returns a
    // string representation of an object.
    // - The default implementation returns the reference
    @Override // tells the compiler we are overriding some default behaviour
    public String toString() {
        return "VehicleWithMethods{" +
                "manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
