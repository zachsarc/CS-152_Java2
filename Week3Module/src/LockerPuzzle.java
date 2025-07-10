import java.util.Scanner;

public class LockerPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declare a constant value for the number of lockers
        System.out.print("Enter the total number of lockers: ");

        // Handle the non-integer case
        if (!sc.hasNextInt()) {
            System.out.println("Invalid Integer for total number of lockers, Exiting...");
            System.exit(0);
        }
        final int NUMBER_OF_LOCKER = sc.nextInt();
        // Handle the negative-integer case
        if (NUMBER_OF_LOCKER < 0) {
            System.out.println("Entered a negative integer, exiting...");
            System.exit(0);
        }

        // Declare a constant value for the total number of students
        System.out.print("Enter the total number of students: ");
        // Handle the non-integer case
        if (!sc.hasNextInt()) {
            System.out.println("Invalid Integer for total number of students, Exiting...");
            System.exit(0);
        }
        int NUMBER_OF_STUDENTS = sc.nextInt();
        // Handle the negative-integer case
        if (NUMBER_OF_STUDENTS < 0) {
            System.out.println("Entered a negative integer, exiting...");
            System.exit(0);
        }

        // Handle to number of students > number of lockers
        if (NUMBER_OF_STUDENTS > NUMBER_OF_LOCKER) {
            NUMBER_OF_STUDENTS = NUMBER_OF_LOCKER;
            System.out.println("Number of Students was changed to " + NUMBER_OF_STUDENTS);
        }

        // Create an array to store the status of each array
        // The first student closed all lockers, each locker[i] is false
        boolean[] lockers = new boolean[NUMBER_OF_LOCKER];

        // Each student changes the lockers
        for (int j = 1; j <= NUMBER_OF_STUDENTS; j++) {
            // Student Sj changes every jth locker
            // starting from the lockers[j - 1].
            for (int i = j - 1; i < NUMBER_OF_LOCKER; i += j) {
                lockers[i] = !lockers[i];
            }
        }

        // Find which one is open
        int totalLockersOpen = 0;
        int totalLockersClosed = 0;
        for (int i = 0; i < NUMBER_OF_LOCKER; i++) {
            if (lockers[i]) {
                System.out.println("Locker " + (i + 1) + " is open");
                totalLockersOpen++;
            } else {
                totalLockersClosed++;
            }
        }

        // Print Lines
        System.out.println("The total number of students " + NUMBER_OF_STUDENTS);
        System.out.println("The total number of lockers " + NUMBER_OF_LOCKER);
        System.out.println("The total number of lockers open " + totalLockersOpen);
        System.out.println("The total numbers of lockers closed " + totalLockersClosed);
        sc.close();
    }
}

    /* OUTPUT
Enter the total number of lockers: 100
Enter the total number of students: 10
Locker 1 is open
Locker 4 is open
Locker 9 is open
Locker 11 is open
Locker 12 is open
Locker 13 is open
Locker 14 is open
Locker 15 is open
Locker 17 is open
Locker 18 is open
Locker 19 is open
Locker 20 is open
Locker 21 is open
Locker 23 is open
Locker 27 is open
Locker 29 is open
Locker 31 is open
Locker 35 is open
Locker 37 is open
Locker 41 is open
Locker 42 is open
Locker 43 is open
Locker 44 is open
Locker 47 is open
Locker 52 is open
Locker 53 is open
Locker 54 is open
Locker 56 is open
Locker 59 is open
Locker 60 is open
Locker 61 is open
Locker 67 is open
Locker 68 is open
Locker 70 is open
Locker 71 is open
Locker 72 is open
Locker 73 is open
Locker 75 is open
Locker 76 is open
Locker 79 is open
Locker 81 is open
Locker 83 is open
Locker 89 is open
Locker 90 is open
Locker 92 is open
Locker 97 is open
Locker 98 is open
Locker 99 is open
Locker 100 is open
The total number of students 10
The total number of lockers 100
The total number of lockers open 49
The total numbers of lockers closed 51
     */
