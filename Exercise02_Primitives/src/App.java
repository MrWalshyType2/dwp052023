public class App {

    public static void main(String[] args) {
        // Task 1
        System.out.println("=== TASK 1 ===");
        System.out.println("COMPLETED: Generated project and added class with main method.");

        // Task 2: Create, initialise, and display variables
        System.out.println("=== TASK 2 ===");
        String name = "Bob";
        byte age = 30;

        System.out.println(name);
        System.out.println(age);
        System.out.println(name + " is " + age + " years old.");

        // Task 3: Apply some arithmetic
        System.out.println("=== TASK 3 ===");
        double m = 1;
        double x = 0.5, c = 15;
        double y = m * x + c;
        System.out.println("m=" + m + ", x=" + x + ", y=" + y);
        System.out.println("m * x + c = " + y);

        // Task 4: Work with booleans
        System.out.println("=== TASK 4 ===");
        boolean isRaining = true, isHappy = true;

        System.out.println("Is raining and is happy: " + (isRaining && isHappy));
        System.out.println("Is raining and is not happy: " + (isRaining && !isHappy));
        System.out.println("Is not raining and is happy: " + (!isRaining && isHappy));
        System.out.println("Is not raining and is not happy: " + (!isRaining && !isHappy));
    }
}
