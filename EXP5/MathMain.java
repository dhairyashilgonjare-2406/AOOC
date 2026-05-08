import MathOperations.MathFunctions;

public class MathMain {
    public static void main(String[] args) {

        MathFunctions mf = new MathFunctions();
        double number = 7.6;

        System.out.println("Original Number: " + number);
        System.out.println("Floor Value: " + mf.findFloor(number));
        System.out.println("Ceil Value: " + mf.findCeil(number));
        System.out.println("Round Value: " + mf.findRound(number));
    }
}
