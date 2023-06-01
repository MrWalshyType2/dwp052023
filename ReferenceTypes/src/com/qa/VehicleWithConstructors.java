package com.qa;

public class VehicleWithConstructors {

    private String manufacturer;
    private int yearOfProduction;

    // Constructors
    // - a constructor is similar to a method
    // - a constructor doesn't have a return type because
    //   it returns an instance of the class it is in
    // - a constructor MUST have the same name as the class it
    //   is defined in
    public VehicleWithConstructors() {
        // this is the empty constructor, commonly called
        // the no-arg constructor
        // Used like: VehicleWithConstructors vc = new VehicleWithConstructors();
    }

    // this constructor will take the manufacturer as input
    public VehicleWithConstructors(String manufacturer) {
        // we have a ~manufacturer~ variable, a field, defined on line
        // 5, but we also have a variable local to the method called ~manufacturer~
        // - the methods variable ~manufacturer~ is said to shadow the
        //   field ~manufacturer~ on line 5
        // - to refer to the field manufacturer on line 5, use the ~this~
        //   keyword before the name of the field followed by a dot
        this.manufacturer = manufacturer;
        // left of = is referring to the manufacturer variable on line 5
        // for the current object being created.
        //
        // right of the = is referring to the manufacturer on line 21.
    }

    // this constructor will take 2 arguments, both the
    // manufacturer and year of production
    public VehicleWithConstructors(String manufacturer, int yearOfProduction) {
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;

    }


    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String input) {
        manufacturer = input;
    }

    @Override
    public String toString() {
        return "VehicleWithMethods{" +
                "manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
