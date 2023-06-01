public class App {

    public static void main(String[] args) {
        System.out.println("IF VERSION");
        // Exercise 3-2: Task 1
        int day = 5;
        // Test days: 0, 1, 3, 5, 6, 7, 8

        if (day >= 1 && day <= 5){
            System.out.println("Weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid");
        }

        System.out.println("SWITCH VERSION");
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        System.out.println("=== Leap years");
        // leap year solution
        int endYear = 2023;

        for (int year = 1; year <= endYear; year++) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
}
