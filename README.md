# Zach L ClassWork and Projects for Java 2

## CS-152 at CT State College

> A Repo' for all of my ClassWork and  Projects that is currently ongoing
  - [Weekly Practice Problem Repo](https://github.com/zachsarc/CS-152-Java-Practice-Problems/tree/main)
  - Week 0: Review of Java 1
  - Week 1: Big O Notation / Time & Space Complexities
  - Week 2: Single & Multi-Dimensional Arrays

***

### Week 0: Review of Java 1

***

### Week 1: Big O Notation / Time & Space Complexities

[Running Log](https://learn-us-east-1-prod-fleet01-beaker-xythos.content.blackboardcdn.com/5783dfb9d7a43/37905217?X-Blackboard-S3-Bucket=learn-xythos-edge-pr-otdt8jd8o9r1q7dp6ohjmnw5fghpnuse1b-s3alias&X-Blackboard-Expiration=1748649600000&X-Blackboard-Signature=389XVdn2Yh60mLZdrM6GaBxPjiFGqk4hkl5AsPaXtUk%3D&X-Blackboard-Client-Id=309004&X-Blackboard-S3-Region=us-east-1&response-cache-control=private%2C%20max-age%3D21600&response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%27Week2Project-Complexity%25281%2529.pdf&response-content-type=application%2Fpdf&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEOL%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJIMEYCIQDED670VlXjOBo3xWP01OJO9PzB7NiAV%2FexK6i6wS94NgIhAOnJoGy%2B3eLDfbePGCKre4dJ9hxudsSIMjaHAAPZFhKyKrwFCKv%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQABoMNTU2OTAzODYxMzYxIgxhiQOAdQu0i91%2Fs80qkAURUYe0c0FlcOQCZSMRUlOI9p42KK1UCZMA6f32F6sHlSBBfDdKkZQKV%2FXmNiX9a%2BCfyNGvfnmqaysLRp0RSCdyi%2FQjAI3H6gKQ6Co8ZjO2nMTpPTPFznME5Tc9PpkfQ4vYhXZz5iYHzFi2F4YPI66%2FgZnbU6v%2F8EOrmv9K5w2iKwijgWzidv1ZUd609zPxblB%2BWPEJ5ppdmHJhNTPNtduTXM%2B1K%2BUb11T75%2FR46VT%2FAreFSEdXONNTTnFIuooXKQn81F3k0xkAuTz96cmzA6oZH5CtaVdNYkIlz2EB9KJOj3PaS260Ss4HGkrwG6ddIbvOq5KXGUKan2154L9W30YfkqaFvDgHkBu8SKBO%2BaujM34uIKjFQIl7UnUjl%2FoH%2FkQ6UcUUqE1OYAV2JQ71pfDUQLJBV6ACjO1X0O1TMMe2lwcjHqYMqlWwVXn0LZTF7zkogaAUdFkhgroFSMeEfpKNVxagbWSTXKYqbRtDfOXuZUB%2B3i%2FjYFV62qPWl8wkGOQHtve1T5n0amnYX1b%2FQaQkhyuWKzDlL1llRfU2TMpuB2NTwyBjSLYrjkzGH5Yn1H9cGVetB9QRr5y0GPqU410NY9cWV1HbA37%2BoT9yQL6KYKQUNlcGhDDFViFBy%2BKDvsoU4WjV3wZJ6bRMp6CIwhp7cNXEzyu9ygWu7W4%2FHkSHUz4sxE%2Fu3SGp9JwfDl2sknuW1qFjYUF91S8iAvw48NqpO5PMqOUNgAiXYjCHNJMF4tvLC7fo1V8ylcxS3yXIE%2FQsHH5PE1myhp8nnqb4dis%2FGpc93Id89Wj4HAjigfHXF1WaCkZG6RuIehmuKTHJDeAo4FO1mApPgOHD9Hseqw2IRJift1j%2BHfxUNi76HoHepzDF5efBBjqwAYCAQULG60wmAsvk9AcKjzrp5Ub%2BF%2FO0%2BRpkvoEdZ7OM1JOg01AkZgmCzJR3YKF03CdybYnmfoW48o6Z8ewn7GWT4ry5KwLY8R2Pp5d5aqcwrDNH3HHGNQTrP4QiKV6kd6cjQvfAmI0qU%2BMYdLX1vwT91iJ1ZuqMWa%2BC1eQXzmTteGwUN0QT9EinveN%2BksCfl5CxbATQZ2w6yb4FzZ1NnrPyBy5DAP8gVh%2FFGiNqgVpw&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20250530T180000Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=ASIAYDKQORRY5IZLOC5A%2F20250530%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=1d22562ddbcf5463ec65ded593b3cdea1fecbf2557efcee3c6bdcc1f6c5dc42d)
```java
import java.util.Scanner;

public class RunningLog {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // Initiate Scanner
        System.out.println("Enter num of runs that you went on: "); //Prompts user to enter runs
        int numberOfRuns = sc.nextInt(); // Captures number of runs
        double distance;
        double totalDistance = 0;
        double time;
        double totalTime = 0;
        double averagePace;

        for (int i = 0; i < numberOfRuns; ++i) {/*
        /*
        O(n) time complexity of a 'for loop'
        which loops through and asks user for each run,
        what the distance was and the time it took
        */
            System.out.println("How long was the distance in miles? (Use Decimal Format): ");
            distance = sc.nextDouble();
            if (distance <= 0){ // Conditional statement to handle the <=0 case
                System.out.println("Please enter a valid value, Please try again");
                i--;
                continue;
            }
            totalDistance += distance; // Adding next distance value to total distance
            System.out.println("What was the time in minutes? (Use Decimal Format): ");
            time = sc.nextDouble();
            if (time <= 0){ // Conditional statement to handle the <=0 case
                System.out.println("Please enter a value higher than 0, Please try again");
                i--;
                continue;
            }
            totalTime += time; // Adding next time value to total time


        }
        averagePace = totalTime / totalDistance; // Computing average pace
        System.out.println("You're Average Pace Was " + averagePace + " Minutes"); // Did not format to 2 decimal places for better accuracy

        sc.close();
    }
}
```
***

### Week 2: Single & Multi-Dimensional Arrays

## Locker Puzzle
```java
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
```
***
## RunningLog v1.1
```java
import java.util.Scanner;

public class RunningLog {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // Initiate Scanner
        System.out.println("Enter number of runs that you went on: "); //Prompts user to enter runs
        int numberOfRuns = sc.nextInt(); // Captures number of runs
        double totalDistance = 0;
        double totalTime = 0;
        double overallAveragePace;
        double[][] runs = new double[numberOfRuns][2]; // Distance is runs[i][0], time is runs[i][1] respectively
        int runCounter = 1; // Introduced a run counter for tracking

        for (int i = 0; i < numberOfRuns; ++i) {
            System.out.println("How long was the distance in miles? (Use Decimal Format): ");
            runs[i][0] = sc.nextDouble(); // Asks the user for distance and sets it in the matrix
            if (runs[i][0] <= 0) { // Conditional statement to handle the <=0 case
                System.out.println("Please enter a valid value, Please try again");
                i--;
                continue;
            }
            totalDistance += runs[i][0]; // Adding next distance value to total distance
            System.out.println("What was the time in minutes? (Use Decimal Format): ");
            runs[i][1] = sc.nextDouble();
            if (runs[i][1] <= 0) { // Conditional statement to handle the <=0 case
                System.out.println("Please enter a value higher than 0, Please try again");
                i--;
                totalDistance -= runs[i][0];
                continue;
            }
            totalTime += runs[i][1]; // Adding next time value to total time
            double eachAveragePace = runs[i][1] / runs[i][0];
            System.out.println("Run " + runCounter + " you had an average pace of " + eachAveragePace + " minutes.");
            System.out.println();
            runCounter++;
        }
        overallAveragePace = totalTime / totalDistance; // Computing average pace
        System.out.println("Your Overall Average Pace Was " + overallAveragePace + " Minutes"); // Did not format to 2 decimal places for better accuracy
        System.out.println();

        // Displaying table for readability alongside values
        int runCounterForDisplay = 1;
        System.out.println("-------------------Running Chart--------------------");
        for (int i = 0; i < runs.length; i++) {
            System.out.print("|" + "Run " + runCounterForDisplay + ":");
            System.out.print(" Distance = " + runs[i][0] + " miles" + " | ");
            System.out.print(" Time = " + runs[i][1] + " minutes" + "|");
            System.out.println();
            System.out.println("----------------------------------------------------");
            runCounterForDisplay++;
        }

        sc.close();
    }
}
```
***

###Week 3: Recursion

## Harmonic Sequence and Lucas Numbers
```java
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
        } else if (n == 1) { // Base Case 2 
            return 1;
        } else {
            return lucasR(n - 1) + lucasR(n - 2);
        }

    }
}
```
