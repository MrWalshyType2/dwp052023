public class WhileStatement {

    public static void main(String[] args) {
        // While statement
        System.out.println("=== WHILE: From 1 to 10");
        int counter = 1;

        while (counter <= 10) {
            System.out.print(counter + " ");

            // increment the counter at the end of each iteration to prevent an infinite loop occuring
            counter++; // increment by 1
        }
        System.out.println();

        System.out.println("=== WHILE: From 10 to 1");
        counter = 10;

        while (counter >= 1) {
            System.out.print(counter + " ");

            // decrement the counter at the end of each iteration to prevent an infinite loop occuring
            counter--; // decrement by 1
        }
        System.out.println();
    }
}
