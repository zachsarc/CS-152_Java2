public class Week4RecursionMain {
    public static void main (String[] args) {
        System.out.println("Harmonic number using iteration is " + harmonicI(5));
        System.out.println("Harmonic number using recursion is " + harmonicR(8));
        System.out.println("Lucas number using recursion is " + lucasR(10));
    }

    // Formula for Harmonic Series: H(n) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
    private static double harmonicI (int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    private static double harmonicR (int n) {
        if (n <= 1) { // Base Case: H(1) = 1
            return 1.0;
        } else {
            return harmonicR(n - 1) + 1.0 / n; // H(n-1) + 1/n
        }
    }

    private static int lucasR (int n) {
        if (n == 0) { // Base Case 1
            return 2;
        } else if (n == 1) {
            return 1;
        } else {
            return lucasR(n - 1) + lucasR(n - 2);
        }

    }
}

/* OUTPUT
Harmonic number using iteration is 2.283333333333333
Harmonic number using recursion is 2.7178571428571425
Lucas number using recursion is 123
 */