public class NestedForStatement {

    public static void main(String[] args) {
        int maxTimesTable = 12;
        int maxMultiples = 12;

        for (int timesTable = 1; timesTable <= maxTimesTable; timesTable++) {
            System.out.println("TIMES TABLE FOR: " + timesTable);

            // nested for loop is required to print out the actual multiples of a given times table
            for (int multipleCount = 1; multipleCount <= maxMultiples; multipleCount++) {
                int multiple = timesTable * multipleCount;
                System.out.print(multiple + " ");
            }
            System.out.println(); // newline ready for next times table
        }

        // this is a valid infinite loop
        /*
        for (;;) {
            System.out.println("hi");
        }
         */
    }
}
