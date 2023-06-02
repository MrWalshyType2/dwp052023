package com.qa;

import java.lang.reflect.Array;

// this example shows how we might have solved
// the tasks using instance methods rather than static
// methods
public class ArraySolutions {

    public static void main(String[] args) {
        // create an object of this class so we can use the
        // instance methods multiplesOf() and sumOf()
        ArraySolutions sol = new ArraySolutions();

        int[] multiplesOf5 = sol.multiplesOf(5, 10);
        System.out.print("MUL OF 5: ");
        for (int multiple : multiplesOf5) System.out.print(multiple + " ");
        System.out.println();

        //
        int sum = sol.sumOf(new int[] { 1, 2, 3, 4, 5 }); // 15
        System.out.println("SUM IS: " + sum);
    }

    public int sumOf(int[] arr) {
        int sum = 0;
        // your loop to sum the array starts here
        for (int number : arr) {
            sum += number;
        }
        // loop ends here
        return sum;
    }

    public int[] multiplesOf(int multiple, int count) {
        int[] multiples = new int[count]; // [0, 0, 0] for a count of 3
        // your loop to fill the array here
        for (int i = 0; i < count; i++) {
            multiples[i] = multiple * (i + 1);
        }
        // loop ends here
        return multiples;
    }
}
