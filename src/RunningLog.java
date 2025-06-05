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

/* OUTPUT
Enter number of runs that you went on:
2
How long was the distance in miles? (Use Decimal Format):
3.2
What was the time in minutes? (Use Decimal Format):
25
Run 1 you had an average pace of 7.8125 minutes.

How long was the distance in miles? (Use Decimal Format):
2
What was the time in minutes? (Use Decimal Format):
18
Run 2 you had an average pace of 9.0 minutes.

Your Overall Average Pace Was 8.269230769230768 Minutes

-------------------Running Chart--------------------
|Run 1: Distance = 3.2 miles |  Time = 25.0 minutes|
----------------------------------------------------
|Run 2: Distance = 2.0 miles |  Time = 18.0 minutes|
----------------------------------------------------

 */