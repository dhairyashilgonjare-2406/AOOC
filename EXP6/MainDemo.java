import ExceptionHandlingDemo.*;

public class MainDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            int result1 = calc.divide(20, 5);
            System.out.println("Result: " + result1);

            int result2 = calc.divide(10, 0); // Will throw DivisionException
            System.out.println("Result: " + result2);

        } catch (DivisionException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
