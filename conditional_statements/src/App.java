// A block in Java, everything between {}, defines a new scope
// - inner scopes can access outer scopes but not the other way around
public class App {
    // Class scope starts

    public static void main(String[] args) {
        // main method scope starts
        // - a local scope is that which belongs to a method, or some code inside a method
        //   which defines a block
        int day = 2;

        // lexical scoping
        if (day == 1) {
            // if (day == 1) scope starts
            String theDay = "Monday";
            System.out.println("Today is " + theDay);
            // if (day == 1) scope ends
        }

        // can I access theDay variable here?
        // - no as it is not this scope
//        System.out.println(theDay);

        System.out.println("=== IF-ELSE-IF ===");
        if (day == 1) {
            System.out.println("MONDAY");
        } else if (day == 2) {
            System.out.println("TUESDAY");
        } else if (day == 3) {
            System.out.println("WEDNESDAY");
        }

        // IF ELSE
        System.out.println("=== IF-ELSE ===");
        // if something is true: do this
        // else: do this instead
        boolean isRaining = false;

        if (isRaining == true) {
            System.out.println("Grabbing brolly");
        } else {
            System.out.println("No need for a brolly");
        }

        // One more main kind of conditional statement
        // - the switch statement
        /*
        switch (data) {
            case VALUE:
               // some code to execute
        }
         */

        int month = 2;
        switch (month) {
            case 1: // if month == 1
                System.out.println("January");
                break;
            case 2: // else if month == 2
                System.out.println("February");
                break;
            case 3: // else if month == 3
                System.out.println("March");
                break; // etc...
            default: // else
                // runs if no case matched
                System.out.println("Incorrect input");
                break;
        }
        // the break statement says to break out of the switch and resume execution here
        // - if we don't specify a break statement, the cases will fall through


        System.out.println("Goodbye");
        // main method scope ends
    }

    // Class scope ends
}
