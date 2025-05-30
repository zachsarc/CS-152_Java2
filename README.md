# Zach L ClassWork and Projects for Java 2

## CS-152 at CT State College

> A Repo' for all of my ClassWork and  Projects that is currently ongoing
  - Week 0: Review of Java 1
  - Week 1: Big O Notation / Time & Space Complexities

***

### Week 0: Review of Java 1

***

### Week 1: Big O Notation / Time & Space Complexities

Running Log
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
