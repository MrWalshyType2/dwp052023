package com.qa.model;

// packages provide a form of encapsulation
// as well
// - remove the public modifier from a class
//   to make it package-private, i.e., you can only
//   acess the class from another class in the same package.

public class User {
    // field/instance variable
    private String username;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    // instance methods
    // - getter and setters methods get and set
    //   data respectively
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username != null && username.length() > 0) {
            this.username = username;
        }
    }
}
