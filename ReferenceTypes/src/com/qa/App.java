package com.qa;
// The package statement identifies which package this file belongs to, and thus its class(es)
// We don't need to import a class if it is in the same package to be able to use it
public class App {

    public static void main(String[] args) {
        // We can create unique instances of vehicle using
        // the ~new~ keyword
        Vehicle mazda = new Vehicle();
        Vehicle toyota = new Vehicle();

        // We can check that these are different objects
        // by comparing their identities
        // - use == to compare identity
        // - use .equals() to compare the data inside an object
        // - .equals() is best practice for objects, but we must
        //   provide a custom implementation for it
        System.out.println("mazda.equals(toyota): " + mazda.equals(toyota));

        // When we create an object, the object itself isn't stored in the
        // variable. A reference (an address) of the object is stored inside the variable,
        // this reference points to a place in the heap where the object resides.
        System.out.println("mazda ref : " + mazda.toString());
        System.out.println("toyota ref: " + toyota.toString());

        //////////////////
        // USING FIELDS
        // - we first need to create an object to access a field
        //      VehicleWithFields.manufacturer = "Mazda"; would be an error
        System.out.println("=== FIELDS EXAMPLE");
        VehicleWithFields vwf = new VehicleWithFields();
        // fields get a default value
        // - we can use dot notation to access a field inside an object:
        //      obj.field
        System.out.println("====== DEFAULT VALUES");
        System.out.println("vwf.manufacturer defaulted to    : " + vwf.manufacturer);
        System.out.println("vwf.yearOfProduction defaulted to: " + vwf.yearOfProduction);

        // we can assign a value to a field using this dot notation, if it is accessible
        // in the current scope and/or environment
        System.out.println("====== AFTER SETTING THE FIELDS VALUES");
        vwf.manufacturer = "Mazda";
        vwf.yearOfProduction = 1990;
        System.out.println("vwf.manufacturer is now    : " + vwf.manufacturer);
        System.out.println("vwf.yearOfProduction is now: " + vwf.yearOfProduction);

        //////////////////
        // Methods
        System.out.println("=== METHODS");
        VehicleWithMethods vwm = new VehicleWithMethods();
        System.out.println();
        System.out.println("====== DEFAULT VALUES");
        // cannot access private fields using dot notation outside of the class they are defined in
//        System.out.println("vwm.manufacturer defaulted to    : " + vwm.manufacturer);
        // We can call the public method getManufacturer() though:
        String mf = "Toyota";
        System.out.println("vwm.manufacturer defaulted to    : " + vwm.getManufacturer());
        // call the public setter method to set the data inside the manufacturer field
        System.out.println("Using vwm.toString() before setting manufacturer: \n" + vwm.toString());

        System.out.println("====== Set the manufacturer field");
        vwm.setManufacturer(mf);
        System.out.println("vwm.getManufacturer() now returns: " + vwm.getManufacturer());
        System.out.println("mf is the same object as vwm.getManufacturer(): " + (mf == vwm.getManufacturer()));
        System.out.println("Using vwm.toString(): \n" + vwm.toString());

        //////////////////
        // Constructors
        System.out.println("=== Constructors");
        VehicleWithConstructors v1 = new VehicleWithConstructors(); // no-arg constructor
        VehicleWithConstructors v2 = new VehicleWithConstructors("Mazda"); // single-arg constructor
        VehicleWithConstructors v3 = new VehicleWithConstructors("Toyota", 1990); // all-args constructor

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}