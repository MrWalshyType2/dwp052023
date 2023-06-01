package com.qa;

public class VehicleWithFields {
    // A field represents some data about an object
    // - a field is called an instance variable because
    //   it can only be accessed by an instance (object) of a class

    // Fields look like:
    //   AccessModifier DataType name;
    // Fields get a default value:
    // - fields of a reference type default to null
    // - primitive numbers default to 0, char to \u0000, boolean to false

    // the public access modifier means this field
    // can be accessed anywhere
    public String manufacturer;
    public int yearOfProduction;
}
