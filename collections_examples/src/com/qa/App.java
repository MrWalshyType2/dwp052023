package com.qa;

import java.util.*;

public class App {

    public static void main(String[] args) {
//        App.collectionExample();
//        App.arraylistExample();
//        App.setExample();
//        App.mapExample();
        App.queueExample();
    }

    public static void queueExample() {
        // Queues operator on a FIFO ordering: First-in is the First-out
        Queue<String> patients = new ArrayDeque<>(); // A Deque is a double-ended queue
        // A standard queue defines two main operations:
        // - enque: add to the back of the queue
        // - deque: remove from the front of the queue
        patients.add("Bob");
        patients.add("Fred");
        System.out.println(patients.remove());
        System.out.println(patients.remove());
    }

    public static void mapExample() {
        Scanner sc = new Scanner(System.in); // for console input

        // created a HashMap to store our questions, we don't care about their order
        Map<String, String> questionBank = new HashMap<>();
        // we then add the questions and their answer to the map
        questionBank.put("What is the capital of England?", "London");
        questionBank.put("Who created the relational model for database management?", "Edgar Codd");
        questionBank.put("Who created the SQL (Structured English Query Language)?", "Donald Chamberlin and Raymond Boyce");

        // get the questions out of the map as a Set of its keys
        Set<String> questions = questionBank.keySet();

        // iterate over the questions
        for (String question : questions) {
            String answer = questionBank.get(question);
            System.out.println(question); // ask the question
            // check if the answer was as expected
            if (sc.nextLine().equals(answer)) {
                System.out.println("Correct!");
            } else System.out.println("Incorrect");
            // question separator
            System.out.println("---");
        }
    }

    public static void setExample() {
        // sets don't retain insertion order by default
        // - we need a special implementation for that
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(0);
        numbers.add(0); // sets cannot contain duplicates
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // iterators are used under the hood to make enhanced for loops work
        // - we can also use them directly
        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            System.out.println(numbersIterator.next());
        }
    }

    public static void arraylistExample() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(0, 0); // insert a new element at index 0 of value 0
        numbers.set(2, 10);

        for (Integer num : numbers) System.out.println(num);
    }

    public static void collectionExample() {
        Collection<Integer> numbers = List.of(1, 2, 3, 4, 5);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
