public class App {

    public static void main(String[] args) {
        // Exercise 3-2: Task 1
        int day = 13;
        // Test days: 0, 1, 3, 5, 6, 7, 8

        if (day >= 1 && day <= 5){
            System.out.println("Weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid");
        }
    }
}
