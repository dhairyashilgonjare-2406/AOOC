// Custom Exception: OddNumberException
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberDemo {
    // Method to check number
    public static void checkEven(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd: " + num);
        } else {
            System.out.println("Number is even: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkEven(10);   // Even number
            checkEven(7);    // Odd number → Exception
        } catch (OddNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
