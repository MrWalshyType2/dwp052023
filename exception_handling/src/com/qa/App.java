package com.qa;

public class App {
    public static void main(String[] args) {
//        App.handlingSimpleException();
//        App.handlingMultipleExceptions();
//        App.handleOrDeclareExample();
        App.customException();
    }

    public static void customException() {
        UserRepository repo = new UserRepository();
        try {
            repo.getUserByIdWithCustomException(10);
        } catch (UserNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void handleOrDeclareExample() {
        UserRepository repo = new UserRepository();
        try {
            repo.getUserById(10);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            // finally block runs after try and catch blocks have done their work
            System.out.println("Does something");
        }
    }

    public static class UserRepository {
        // If we don't handle a checked exception inside a method, we must
        // write ~throws ExceptionType~ after the parameter list but before the body of the method
        public String getUserById(int id) throws Exception {
            throw new Exception("User with id '" + id + "' does not exist.");
        }

        public String getUserByIdWithCustomException(int id) {
            throw new UserNotFoundException(id);
        }
    }

    public static void handlingMultipleExceptions() {
        int[] arr = new int[10];

        // IndexOutOfBoundsException is a RuntimeException, so we don't have to handle it but
        // it would be good practice to handle it if you expect that you may encounter an index
        // that is too large for the given array or collection
        try {
            arr[9] = 30;
            // the throw keyword is used to throw an Exception
            // - we must pass it an exception object
            throw new RuntimeException("Ahh, something happened");
        } catch (IndexOutOfBoundsException ie) {
            System.err.println("Index out of bounds exception occurred");
            // System.in, System.out, System.err
            // we can also print additional information using the exception object
            ie.printStackTrace();
        } catch (RuntimeException re) {
            System.err.println(re.getMessage());
        }
    }

    public static void handlingSimpleException() {
        int[] arr = new int[10];

        // IndexOutOfBoundsException is a RuntimeException, so we don't have to handle it but
        // it would be good practice to handle it if you expect that you may encounter an index
        // that is too large for the given array or collection
        try {
            arr[10] = 30; // index specified is too large, throws an IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException ie) {
            System.err.println("Index out of bounds exception occurred");
            // System.in, System.out, System.err
            // we can also print additional information using the exception object
            ie.printStackTrace();
        }
    }
}
