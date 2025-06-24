import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionPractice {

    public static double highTemperature() {
        System.out.println("What was the highest temperature today? (in fahrenheit)");
        Scanner sc = new Scanner(System.in);
        double high = 0.0;
        try {
            high = sc.nextDouble();
            return high;
        } catch (InputMismatchException IME) {
            System.out.println("Please input a valid integer or decimal number.");
            return highTemperature(); // Recursive call to rerun the method if invalid
        }
    }

    public static double lowTemperature() {
        System.out.println("What was the lowest temperature today? (in fahrenheit");
        Scanner sc = new Scanner(System.in);
        double low = 0.0;
        try {
            low = sc.nextDouble();
            return low;
        } catch (InputMismatchException IME) {
            System.out.println("Please input a valid integer or decimal number.");
            return lowTemperature();
        }
    }

    // Method to isolate validation
    public static void quickCheck(double high, double low) throws IllegalArgumentException {
        if (low > high) {
            throw new IllegalArgumentException("High must be >= Low, Try again...");
        }
    }

    public static void main(String[] args) {
        char unicodeChar = '°'; // Added Unicode char for readability and user-friendliness
        double high = 0.0;
        double low = 0.0;
        // Loop ensures the user keeps trying until true
        while (true) {
            high = highTemperature();
            low = lowTemperature();

            try {
                quickCheck(high, low);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error:" + e.getMessage());
                System.out.println("Try Again...\n");
            }
        }
        System.out.println("The range between the temperatures today was " + (high - low) + unicodeChar + " Fahrenheit");
    }
}
