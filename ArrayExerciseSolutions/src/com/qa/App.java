package com.qa;

public class App {

    public static void main(String[] args) {
        App.foo();

        int[] multiplesOf5 = multiplesOf(5, 10);
        System.out.print("MUL OF 5: ");
        for (int multiple : multiplesOf5) System.out.print(multiple + " ");
        System.out.println();

        //
        int sum = sumOf(new int[] { 1, 2, 3, 4, 5 }); // 15
        System.out.println("SUM IS: " + sum);
    }

    public static int sumOf(int[] arr) {
        int sum = 0;
        // your loop to sum the array starts here
        for (int number : arr) {
            sum += number;
        }
        // loop ends here
        return sum;
    }

    public static int[] multiplesOf(int multiple, int count) {
        int[] multiples = new int[count]; // [0, 0, 0] for a count of 3
        // your loop to fill the array here
        for (int i = 0; i < count; i++) {
            multiples[i] = multiple * (i + 1);
        }
        // loop ends here
        return multiples;
    }

    // A static method does not need an instance of a class to be called
    // i.e., we can call the following method in the main() method without doing:
    //     App app = new App();
    //     app.foo();
    //
    // From another method, we can just call App.foo(); via the class name rather than an object
    public static void foo() {
        System.out.println("Hello world");
    }

}
