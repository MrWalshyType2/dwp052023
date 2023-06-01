public class ForStatement {

    public static void main(String[] args) {

        // Python: for i in range(1, 11):
        System.out.println("=== FOR: From 1 to 10");
        for (int counter = 1; counter <= 10; counter++) {
            System.out.print(counter + " ");
        }
        System.out.println();

        System.out.println("=== FOR: From 10 to 1");
        for (int counter = 10; counter >= 1; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();


    }
}
