public class Exercise3_1 {

    public static void main(String[] args) {
        // Task 2: While loops
        System.out.println("WHILE: print n and n + 10 pairs");
        int n = 0;
        while (n < 10) {
            System.out.println("(" + n + ", " + (n + 10) + ")");
            n++;
        }

        System.out.println("WHILE: print n and 2^n pairs");
        n = 1;
        int result = 1;
        while (n < 10) {
            result = result * 2;
            System.out.println("(" + n + ", " + result + ")");
            n++;
        }

        // Task 3: Rewrite as for loop
        System.out.println("AS FOR LOOP");
        for (n = 0; n < 10; n++) {
            System.out.println("(" + n + ", " + (n + 10) + ")");
        }

        System.out.println("AS FOR LOOP: n and 2^n");
        for (n = 1, result = n; n < 10; n++) {
            result = result * 2;
            System.out.println("(" + n + ", " + result + ")");
        }
    }
}
