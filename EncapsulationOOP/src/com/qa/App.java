package com.qa;

// for classes not in the same package, we must import
// them to use them
// - imports are below the package declaration
//   but above the class declaration
import com.qa.model.User;

public class App {

    public static void main(String[] args) {
        User user = new User();
        user.setUsername(null);

        System.out.println("USERNAME: " + user.getUsername());
    }
}
