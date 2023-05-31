public class App {

    // entry point to our app
    public static void main(String[] args) {
        // PROGRAM STARTS

        // VARIABLE DECLARATION:
        //    DataType variableName;
        // VARIABLE DECLARATION + INITIALISATION:
        //    DataType variableName = value;
        //
        /*
            If a variable is declared but not initialised, it has a value of 'undefined' which means
            trying to use the variable before it is initialised would cause a compiler error.
         */

        byte b = 20;
        short s = 3000;
        int i = 3000000;
        long l = 3000000000L;
        // To specify a long, you must put an L after the number
        // - we have to do this as all literal numbers are integers by default

        // floats and double-precision floating-points are decimal number types
        // - they are inherently imprecise, avoid calculations for currency and other things requiring a
        //   high degree of precision. Use BigDecimal or integer types instead.
        float myFloat = 42342.42342F;
        // floats must have the letter F after them, as all literal decimal numbers in Java
        // default to a type double
        double myDouble = 434234342.3243242;

        // char can take a few different values
        // - integer number
        // - unicode value
        // - a literal letter
        char integerExample = 65; // A
        char unicodeExample = '\u0041'; // A
        char literalExample = 'A'; // A

        // a boolean is either true or false
        boolean trueVar = true;
        boolean falseVar = false;

        // remember, variables are statically typed in Java
        // trueVar = 32; // compiler error as an int cannot be converted to a boolean

        System.out.println(b);

        System.out.println("CHARS:");
        System.out.println(integerExample);
        System.out.println(unicodeExample);
        System.out.println(literalExample);
        // PROGRAM ENDS
    }

}
