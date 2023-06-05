package com.qa;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(int id) {
        // pass a message upto the constructor of RuntimeException
        // - we can later retrieve that message if this exception gets thrown
        super("404: User with id '" + id + "' not found!");
    }
}
