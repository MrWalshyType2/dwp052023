package com.qa.cowsay_solution_mvn;

import com.github.ricksbrown.cowsay.Cowsay;

public class App {

    public static void main(String[] args) {
        String[] cargs = new String[]{"-f", "Stegosaurus", "Hello from Java!"};
        String result = Cowsay.say(cargs);
        System.out.println(result);
    }
}
