package com.qa;

public class App {
    public static void main(String[] args) {
        // declared and initialised an array of ints with a size of 10
        int[] numbers = new int[10];

        // access each value by its index
        int firstValueInNumbers = numbers[0];
        int lastValueInNumbers = numbers[numbers.length - 1]; // last index is always length - 1
        System.out.println("FIRST VALUE IN 'numbers': " + firstValueInNumbers);
        System.out.println("LAST VALUE IN 'numbers' : " + lastValueInNumbers);

        // we can declare and initialise an array on separate lines
        String[] names;
        names = new String[5]; // 5 null values by default

        // set a value in an array by its index
        names[0] = "Bob";
        System.out.println("FIRST NAME IN 'names' : " + names[0]); // Bob
        System.out.println("SECOND NAME IN 'names': " + names[1]); // null

        // we can use an array initialiser to initialise an array with values and a size inferred from the
        // amount of those values
        int oldSize = numbers.length;
        numbers = new int[] { 1,2,3,4,5 };
        System.out.println("Numbers was of size " + oldSize + " but is now of size " + numbers.length);

        // The short-form array initialiser can only be used on the same line as the array declaration
        int[] otherNumbers = { 1, 2, 3 }; // length: 3

        // Array iteration
        System.out.println("Array iteration: for loop");
        System.out.print("NUMBERS: [");
        for (int index = 0; index < numbers.length; index++) {
            if (index == numbers.length - 1) System.out.print(numbers[index]);
            else System.out.print(numbers[index] + " ");
        }
        System.out.println("]");

        // Enhanced for loop
        // - we don't get an index
        // - we use this for reading data, not manipulating the array itself
        // for (DataType variableName : collection) {}
        System.out.println("Array iteration: enhanced for loop");
        System.out.print("NUMBERS: [");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("]");

        // Multi-dimensional arrays
        // - an array of arrays
        int maxTimesTable = 12;
        int maxMultiples = 12;
        int[][] timesTables = new int[maxTimesTable][maxMultiples];
        /*
          | 0 | 1 | 2 | 3 | ...
        0 | 1 | 2 | 3 | 4 |
        1 | 2 | 4 | 6 | 8 |
        2 |
        3 |
        ...
         */

        // we can use nested loops to fill this array
        for (int row = 0; row < timesTables.length; row++) {
            // the timestable is row + 1
            int[] rowData = timesTables[row];

            for (int col = 0; col < rowData.length; col++) {
                // the current multiple to calculate is col + 1
                rowData[col] = (row + 1) * (col + 1);
                System.out.println("SET timesTables[" + row + "][" + col + "] (" + (row + 1) + " * " + (col + 1) + ") TO " + rowData[col]);
            }
        }
    }
}
