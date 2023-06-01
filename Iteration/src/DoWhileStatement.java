import java.util.Scanner;

public class DoWhileStatement {

    public static void main(String[] args) {
        // Create a Scanner which can read input from the console
        Scanner sc = new Scanner(System.in); // System.in refers to your consoles input stream by default
        int counter = 0;
        boolean isRunning = true;

        // Our program will ask the user for a command
        // - I increments the counter
        // - R resets the counter to 0
        // - Q quits the application
        do {
            // do execute this block at least once
            System.out.print("> "); // prompt for input
            String input = sc.nextLine();

            // The key thing to remember for equality operations:
            // - == compares values, perfectly fine to use on primitive types
            // - for objects, we should use a method called .equals()
            //     "s".equals("s"); // true

            if (input.equals("I")) {
                counter++;
                System.out.println("COUNTER IS NOW: " + counter);
            } else if (input.equals("R")) {
                counter = 0;
                System.out.println("COUNTER HAS BEEN RESET TO 0");
            } else if (input.equals("Q")) {
                isRunning = false;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        } while (isRunning == true); // the condition is checked at the end of each iteration

        // execution resumes here after do-while
    }
}
