public class App {

    public static void main(String[] args) {
        // String concatenation is joining two things together to build a new string

        // Math operators: +, -, *, /, %
        System.out.println("MATH OPERATORS: +, -, *, /, %");
        System.out.println("3 + 3 = " + (3 + 3));
        int product = 3 * 3;
        System.out.println("3 * 3 = " + product);

        // TRY: -, /, %

        // Compound assignment operators:
        System.out.println("COMPOUND ASSIGNMENT: +=, -=, *=, /=");
        int aggregate = 0;
        aggregate += 10; // aggregate = aggregate + 10
        aggregate += 20; // aggregate = aggregate + 20
        System.out.println("The aggregate is: " + aggregate);

        // Comparison operators:
        // - work only with boolean values
        System.out.println("COMPARISON: >, <, >=, <=, !=, ==");
        boolean isRaining = true;
        boolean isCloudy = false;

        System.out.println("Is it raining? " + (isRaining == true));
        System.out.println("Is it raining? " + (isRaining)); // short form of the previous line
        System.out.println("Is it cloudy? " + (isCloudy == true));
        System.out.println("Is it not cloudy? " + (isCloudy != true));

        // Logical and short-circuit boolean operators:
        System.out.println("LOGICAL: |, &, ^");
        // | = OR: Either the left or right has to be true to evaluate to true, both sides are checked
        // & = AND: Both the left and right need to be true to evaluate to true, both sides are always checked
        // ^ = XOR: Either the left is true or the right is true, but not both to return true.
        System.out.println("true OR false = " + (true | false));
        System.out.println("true OR foo() = " + (true | foo())); // Logical OR does not short-circuit

        System.out.println("SHORT CIRCUIT: ||, &&");
        // || = OR: Returns true if either value is true. Does not check the right side if the left is true
        // && = AND: Returns true if both sides are true, otherwise false. Does not check the right side if the left was false.
        System.out.println(1);
        System.out.println("false || foo(): " + (false || foo()));
        System.out.println(2);
        System.out.println("true  || foo(): " + (true || foo())); // short-circuits
        System.out.println(3);
        System.out.println("false && foo(): " + (false && foo())); // short-circuits
        System.out.println(4);
        System.out.println("true  && foo(): " + (true && foo()));

        System.out.println("The ! (not) operator");
        // ! inverts a boolean, !true is false and !false is true
        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);
    }

    public static boolean foo() {
        System.out.println("foo");
        return true;
    }
}
