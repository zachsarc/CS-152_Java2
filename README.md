# Zach L ClassWork and Projects for Java 2

## CS-152 at CT State College

> A Repo' for all of my ClassWork and  Projects
  - [Weekly Practice Problem Repo](https://github.com/zachsarc/CS-152-Java-Practice-Problems/tree/main)
  - Week 1: Review of Java 1
  - Week 2: Big O Notation / Time & Space Complexities
  - Week 3: Single & Multi-Dimensional Arrays
  - Week 4: Recursion
  - Week 5: Object-Oriented Programming Concepts (OOP)
  - Week 6: Exception Handling & File I/O
  - Week 7: JavaFX & GUI (Seperate Repo.)
  - Week 8: Lists
  - Week 9: Stack and Queue
  - Week 10: Sets and Maps
  - Week 11: Sorting
  - Week 12: Graphs & Review Week
  - Week 13: Final Project

***

## Week 1: Review of Java 1

***

## Week 2: Big O Notation / Time & Space Complexities

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

## Week 3: Single & Multi-Dimensional Arrays

### Locker Puzzle
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
### RunningLog v1.1
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

## Week 4: Recursion

### Harmonic Sequence and Lucas Numbers
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
***
### GCD (a, b) Program
```java
/** INSTRUCTIONS:
 * Program to find the Greatest Common Divisor (GCD) using recursion.
 *
 * The GCD(m,n) is defined recursively as follows:
 * If m % n is 0, gcd(m, n) is n
 * Otherwise, gcd(m, n) is gcd(n, m % n)
 *
 * Write a recursive method to find the GCD. Write a test program that prompts the
 user to enter two integers and displays their GCD.
 *
 * This program prompts the user to enter two integers and displays their GCD.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Week3FindingGCD {
    public static void main(String[] args) {
        // Try with resources for the autoclose feature
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number 1 (a): ");
            int numOne;
            try {
                numOne = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Integer, exiting...");
                return;
            }
            System.out.println("Enter number 2 (b): ");
            int numTwo;
            try {
                numTwo = sc.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Invalid Integer, exiting...");
                return;
            }

            // Handles the non-positive integers
            if (numOne <= 0 || numTwo <= 0) {
                System.out.println("Please enter positive integers only");
                return;
            }
            System.out.println("Your GCD(a,b) is : " + getGCD(numOne, numTwo));
        }
    }

        public static int getGCD ( int a, int b){
            if (a % b == 0) { // Base case
                return b;
            }
            return getGCD(b, a % b); // Example of tail recursion
        }
    }
```
***
## Week 5: Object-Oriented Programming Concepts (OOP)
### MainClass
```java
public class MainWeek5{
	public static void main(String[] args){
	//Main Method... DO NOT CHANGE THIS METHOD
		Cat kitty = new Cat();
		Dog puppy = new Dog();
		Chihuahua buffy = new Chihuahua();
		Cow bessie = new Cow();
		Sheep aSheep = new Sheep();
		Fox littleFox = new Fox();
		kitty.Speak();
		puppy.Speak();
		buffy.Speak();
		bessie.Speak();
		aSheep.Speak();
		littleFox.Speak();
		System.out.println("The cow produces " + bessie.Milk() + " Gallons today.");
		trySwimming(puppy);
		trySwimming(buffy);
		trySwimming(kitty);
		trySwimming(bessie);
		trySwimming(aSheep);
		trySwimming(littleFox);
	}
	private static void trySwimming(Mammal currentMammal) {
		if (currentMammal instanceof Dog || currentMammal instanceof Fox) {
			System.out.print("Splash, paddle paddle ");
			currentMammal.Speak();
		} else if (currentMammal instanceof Cat) {
			System.out.println("hiss");
		} else {
			currentMammal.Speak();
		}

	}
}
```
### Mammal Class
```java
public abstract class Mammal{
	public abstract void Speak();
}
```
### Cat Class
```java
public class Cat extends Mammal {
	public void Speak() {
		System.out.println("Meow");
	}
}
```
### Chihuahua Class
```java
public class Chihuahua extends Dog {
    public void Speak() {
        System.out.println("Yip");
    }
}
```
### Cow Class
```java
public class Cow extends Mammal {
    public void Speak() {
        System.out.println("Moo");
    }

    public int Milk() {

        // Define range
        int max = 5;
        int min = 2;
        int range = max - min + 1;

        // Generate and return a random number within 2 to 5
        return (int) (Math.random() * range) + min;
    }
}
```
### Dog Class
```java
public class Dog extends Mammal {
	public void Speak() {
		System.out.println("Woof");
	}

}
```
### Fox Class
```java
import java.util.Scanner;
public class Fox extends Mammal {

    @Override
    public void Speak() {
        System.out.println("What does the fox say?");
        Scanner sc = new Scanner(System.in);
        String foxWords = sc.nextLine();

        // Handling integer input
        if (foxWords.matches("[0-9]*")) {
            System.out.println("You entered no words :( | exiting...");
            System.exit(0);
        } else {
            System.out.println(foxWords + "!");
        }
    }
}
```
### Sheep Class
```java
public class Sheep extends Mammal {
    public void Speak() {
        System.out.println("Baa");
    }
}
```
***
## Week 6: Exception Handling and File I/O
### Temperature Exception Practice
```java
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionPractice {

    public static double highTemperature() {
        System.out.println("What was the highest temperature today? (in Fahrenheit)");
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
        System.out.println("What was the lowest temperature today? (in Fahrenheit)");
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
            throw new IllegalArgumentException(" High must be >= Low, Try again...");
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
```
***
## Week 7: JavaFX GUI Running Log
## Please refer to [this](https://github.com/zachsarc/CS-152-RunningLogGUIJavaFX/tree/main) Repository for the Week 7 exercise.
***
## Week 8: Lists
## Lists Exercise
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("The collection contains " + myRange(0.4, 10.3));
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(10);
        list.add(4);
        list.add(2);
        list.add(5);

        System.out.println("The sum of these elements are " + listSum(list));
        System.out.println();
        System.out.println("The recursive adding these elements produces a total of " + listSumR(list, 0));
        System.out.println();
        System.out.println("The mean of these numbers of the list " + list + " is " + mean(list));
        System.out.println();
        System.out.println("The squared result of each of these numbers in the list " + list + " is " + squareList(list));

    }

    public static ArrayList<Integer> myRange(double x, double y) {
        ArrayList<Integer> collection = new ArrayList<>();

        int start = (int) Math.ceil(Math.min(x, y));
        int end = (int) Math.floor(Math.max(x, y));

        for (int i = start; i <= end; i++) {
            collection.add(i);
        }
        return collection;
    }

    private static double listSum(ArrayList<Integer> list) {
        int result = 0;
        for (Integer e : list) {
            result += e;
        }
        return result;
    }

    private static double listSumR(ArrayList<Integer> list, int total) {
        if (list.isEmpty()) {
            return total;
        }

        int firstElement = list.getFirst();
        ArrayList<Integer> remainingList = new ArrayList<>(list.subList(1, list.size()));

        return listSumR(remainingList, total + firstElement);
    }

    private static int mean(ArrayList<Integer> list) {
        int nums = (int) listSum(list);
        return nums / list.size();
    }

    private static ArrayList<Integer> squareList(ArrayList<Integer> list) {
        ArrayList<Integer> squaredList = new ArrayList<>();

        for (int number : list) {
            squaredList.add(number * number);
        }
        return squaredList;
    }
}
```
***
## Week 9: Stack and Queue
## Stack and Queue Exercise
```java
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                MyStack<Integer> stack = new MyStack<>();
                MyQueue<Integer> queue = new MyQueue<>();

                while (true) {
                    System.out.println("Enter the integers of your stack one-by-one, when your done type \"done\": ");
                    String input = sc.next();

                    if (input.equalsIgnoreCase("done")) {
                        break;
                    }

                    try {
                        int number = Integer.parseInt(input);
                        stack.push(number);
                        System.out.println("You entered: " + number);
                        stack.display();
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid integer or 'done'");
                    }
                }
                System.out.println("Next, here is your sorted stack: ");
                stack.getMin();
                stack.displaySorted();

                // Queue Portion
                while (true) {
                    System.out.println("Enter the integers of your queue one-by-one, when your done type \"done\": ");
                    String input = sc.next();

                    if (input.equalsIgnoreCase("done")) {
                        break;
                    }

                    try {
                        int number = Integer.parseInt(input);
                        queue.enqueue(number);
                        System.out.println("You entered: " + number);
                        queue.display();
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid integer or 'done'");
                    }
                }
                System.out.println("Next, here is your sorted queue: ");
                queue.getMin();
                queue.displaySorted();

                sc.close();
        }
    }
```
### MyStack extension of Main
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class MyStack<T extends Comparable<T>> {
    private LinkedList<T> stack = new LinkedList<>();
    private LinkedList<T> minStack = new LinkedList<>();

    public void push(T element) {
        stack.push(element);
        if (minStack.isEmpty() || element.compareTo(minStack.peek()) <= 0) {
            minStack.push(element);
        }
    }

    public T pop() {
        if (stack.isEmpty()) return null;

        T popped = stack.pop();
        if (popped.equals(minStack.peek())) {
            minStack.pop();
        }
        return popped;
    }

    public T peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack: " + stack);
    }

    public void displaySorted() {
        ArrayList<T> sortedList = new ArrayList<>(stack);
        Collections.sort(sortedList);
        System.out.println("Sorted Stack: " + sortedList);
    }

    public T getMin() {
        if (minStack.isEmpty()) return null;
        return minStack.peek();
    }
}
```
### MyQueue extension of Main class
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class MyQueue<T extends Comparable<T>> {
    private LinkedList<T> queue = new LinkedList<>();
    private LinkedList<T> minQueue = new LinkedList<>();


    public void enqueue(T element) {
        queue.addLast(element);
        while (!minQueue.isEmpty() && minQueue.getLast().compareTo(element) > 0) {
            minQueue.removeLast();
        }
        minQueue.addLast(element);
    }

    public T dequeue() {
        if (queue.isEmpty()) return null;

        T removed = queue.pollFirst();
        if (removed.equals(minQueue.getFirst())) {
            minQueue.removeFirst();
        }
        return removed;
    }

    public T peek() {
        return queue.peekFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Queue: " + queue);
    }

    public void displaySorted() {
        List<T> sortedQueue = new ArrayList<>(queue);
        Collections.sort(sortedQueue);
        System.out.println("Sorted Queue: " + sortedQueue);
    }

    public T getMin() {
        if (minQueue.isEmpty()) return null;
        return minQueue.getFirst();
    }
}
```
***
## Week 10: Sets and Maps
## Map Assignment
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MapMain {

    private static List<MyEntry> myMap = new ArrayList<MyEntry>();


    public static void main(String[] args) {
        myMap.add(new MyEntry(1,"Hi"));
        myMap.add(new MyEntry(23,"Hello"));
        myMap.add(new MyEntry(17,"Hey"));
        myMap.add(new MyEntry(2,"Greetings"));
        myMap.add(new MyEntry(20,"Yo"));
        addToMap("Good Day");
        System.out.println("Original Order: ");
        outputMyMap(myMap);
        System.out.println();

        System.out.println("\nSorted by ASC keys: ");
        sortMyMapKeysAsc(myMap);
        outputMyMap(myMap);
        System.out.println();

        System.out.println("\nSorted by DESC keys: ");
        sortMyMapKeysDesc(myMap);
        outputMyMap(myMap);
        System.out.println();

        System.out.println("\nSorted by ASC values: ");
        sortMyMapValuesAsc(myMap);
        outputMyMap(myMap);
        System.out.println();

        System.out.println("\nSorted by DESC values: ");
        sortMyMapValuesDesc(myMap);
        outputMyMap(myMap);
        System.out.println();

        System.out.println("Outputting Fancy: ");
        outputMyFancyMap(myMap);
    }

    //Output comma key-value pairs on each line, for each Entry in myMap
    //Note the special way the for loop works.
    private static void outputMyMap(List<MyEntry> myMap) {
        for(Object oEntry: myMap.toArray()) {
            MyEntry entry = (MyEntry)oEntry;
            System.out.println(((Integer)entry.key).toString() + '-' + entry.value);
        }
    }

    //Sorts the myMap object array in ascending order by keys
    private static void sortMyMapKeysAsc(List<MyEntry> myMap) {
        int n = MapMain.myMap.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (MapMain.myMap.get(j).key > MapMain.myMap.get(j+1).key)
                {
                    MyEntry temp = MapMain.myMap.get(j);
                    MapMain.myMap.set(j, MapMain.myMap.get(j+1));
                    MapMain.myMap.set(j+1,temp);
                }
        return;
    }
    //Sorts the myMap object array in descending order by keys
    private static void sortMyMapKeysDesc(List<MyEntry> myMap) {
        Collections.sort(myMap, ((o1, o2) -> Integer.compare(o2.key, o1.key)));
    }
    //Sorts the myMap object array in ascending order by values
    private static void sortMyMapValuesAsc(List<MyEntry> myMap) {
        Collections.sort(myMap, ((o1, o2) -> o1.value.compareTo(o2.value)));
    }
    //Sorts the myMap object array in ascending order by keys
    private static void sortMyMapValuesDesc(List<MyEntry> myMap) {
        Collections.sort(myMap, ((o1, o2) -> o2.value.compareTo(o1.value)));
    }

    private static void outputMyFancyMap(List<MyEntry> myMap) {
        sortMyMapKeysAsc(myMap);
        ArrayList myKeys = new ArrayList();
        ArrayList myValues = new ArrayList();
        if (!myKeys.isEmpty()) {
            System.out.println("The list you provided is currently Empty");
        } else {
            for (MyEntry v : myMap) {
                myKeys.add(v.key);
                myValues.add(v.value);
            }
            System.out.println("KEYS: " + myKeys); // 1st & 2nd output
            System.out.println("Values: " + myValues); // 3rd and 4th output


            System.out.println("ALL OUTPUT:"); // 5th output
            for (MyEntry q : myMap) { // 6th output
                System.out.println(q.key + "," + q.value);
            }
        }
    }

    private static void addToMap(String value) {
        int maxKey = Collections.max(myMap, Comparator.comparingInt(entry -> entry.key)).key;
        MyEntry newEntry = new MyEntry(maxKey + 1, value);
        myMap.add(newEntry);
    }
}

/* OUTPUT
Original Order:
1-Hi
23-Hello
17-Hey
2-Greetings
20-Yo
24-Good Day

Sorted by ASC keys:
1-Hi
2-Greetings
17-Hey
20-Yo
23-Hello
24-Good Day

Sorted by DESC keys:
24-Good Day
23-Hello
20-Yo
17-Hey
2-Greetings
1-Hi

Sorted by ASC values:
24-Good Day
2-Greetings
23-Hello
17-Hey
1-Hi
20-Yo

Sorted by DESC values:
20-Yo
1-Hi
17-Hey
23-Hello
2-Greetings
24-Good Day

Outputting Fancy:
KEYS: [1, 2, 17, 20, 23, 24]
Values: [Hi, Greetings, Hey, Yo, Hello, Good Day]
ALL OUTPUT:
1,Hi
2,Greetings
17,Hey
20,Yo
23,Hello
24,Good Day
*/
```
### MyEntry extension of MapMain class
```java
public class MyEntry {
    int key;
    String value;

    public MyEntry(int k, String v) {
        key = k;
        value = v;
    }
}
```
***
## Week 11: Sorting
## MergeSort & QuickSort
### MergeSort
```java
import java.util.ArrayList;

public class MergeSortMain {

    public static void main(String [] args) {
        ArrayList<Integer> theList = new ArrayList<Integer>();
        theList.add(3);
        theList.add(7);
        theList.add(44);
        theList.add(23);
        theList.add(11);
        theList.add(55);
        theList.add(43);
        theList.add(55);
        theList.add(43);
        theList.add(51);
        theList.add(41);
        theList.add(52);
        theList.add(43);
        theList.add(13);
        System.out.println(theList);
        theList = mergeSort(theList);
        System.out.println(theList);
    }

    private static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        if(size(list)>1) {
            ArrayList<ArrayList<Integer>> splitList = partition(list, size(list)/2);
            ArrayList<Integer> list1 = mergeSort(splitList.get(0));
            ArrayList<Integer> list2 = mergeSort(splitList.get(1));
            list = merge(list1,list2);
        }
        return list;
    }

    private static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> combinedList = new ArrayList<Integer>();
        while(!isEmpty(list1) && !isEmpty(list2)){
            if(first(list1) < first(list2)) {
                addLast(combinedList,remove(list1,0));
            }else {
                addLast(combinedList,remove(list2,0));
            }
        }
        while(!isEmpty(list1)){
            addLast(combinedList,remove(list1,0));
        }
        while(!isEmpty(list2)){
            addLast(combinedList,remove(list2,0));
        }
        return combinedList;
    }

    private static int size(ArrayList<Integer> list) {
        return list.size();
    }
    private static boolean isEmpty(ArrayList<Integer> list) {
        return list.isEmpty();
    }
    private static int first(ArrayList<Integer> list) {
        return list.get(0);
    }
    private static int remove(ArrayList<Integer> list, int index) {
        return(list.remove(index));
    }
    private static void addLast(ArrayList<Integer> list, int item) {
        list.add(list.size(),item);
    }
    private static ArrayList<ArrayList<Integer>> partition(ArrayList<Integer> list,int index){
        ArrayList <Integer> list1 = new ArrayList<Integer>(list.subList(0, index));
        ArrayList <Integer> list2 = new ArrayList<Integer>(list.subList(index, size(list)));
        ArrayList <ArrayList<Integer>> retVal = new ArrayList<ArrayList<Integer>>();
        retVal.add(list1);
        retVal.add(list2);
        return retVal;
    }

}
```
### QuickSort
```java

import java.util.ArrayList;
import java.util.Random;

public class QuickSortMain {

    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> theList = new ArrayList<Integer>();
        theList.add(3);
        theList.add(7);
        theList.add(44);
        theList.add(23);
        theList.add(11);
        theList.add(55);
        theList.add(43);
        theList.add(55);
        theList.add(43);
        theList.add(51);
        theList.add(41);
        theList.add(52);
        theList.add(43);
        theList.add(13);
        System.out.println(theList);
        theList = quickSort(theList);
        System.out.println(theList);
    }


    //Input: ArrayList list of Integer objects, presumably unordered.
    //Output/return: ArrayList of the Integer objects from the input list, but ordered.
    //General Algorithm:
    //If list is empty, return list
    //Otherwise:
    //	-Pick a pivot integer, using the pick method
    //	-partition the list into sub-lists L, E & G (use partitionQ method)
    //	-Call quicksort on the L sub list
    //	-Call quicksort on the G sub list
    //	-Add each element from L, E & G (in that order) to the ArrayList to be returned.
    //	-Return the ArrayList that contains the combined L, E & G ArrayLists
    private static ArrayList<Integer> quickSort(ArrayList<Integer> list) {
        ArrayList<Integer> sortedList = new ArrayList<>();
        if (list.isEmpty()) {
            return list;
        }
        int pivot = pick(list);
        ArrayList<ArrayList<Integer>> partitioned = partitionQ(list, pivot);
        ArrayList<Integer> L = partitioned.get(0);
        ArrayList<Integer> E = partitioned.get(1);
        ArrayList<Integer> G = partitioned.get(2);

        ArrayList<Integer> sortedL = quickSort(L);
        ArrayList<Integer> sortedG = quickSort(G);

        sortedList.addAll(sortedL);
        sortedList.addAll(E);
        sortedList.addAll(sortedG);
        return sortedList;
    }

    //Input: ArrayList list of an Integer object; pivotIndex which is the index for the pivot Integer
    //Output/return: ArrayList of 3 ArrayLists, L E & G
    //			L: ArrayList of Integer objects with values less than the pivot Integer value
    //			E: ArrayList of Integer objects with values equal to the pivot Integer value (just 1 Integer object for unique lists)
    //			G: ArrayList of Integer objects with values greater than the pivot Integer value
    //			NOTE: pivot Integer value is NOT the pivot index.
    //			NOTE: L is added to the return value first, followed by E, then G.
    private static ArrayList<ArrayList<Integer>> partitionQ(ArrayList<Integer> list,int pivotIndex){
        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> E = new ArrayList<>();
        ArrayList<Integer> G = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int pivotValue = list.get(pivotIndex);

            for (int i : list) {
                if (i < pivotValue) {
                    L.add(i);
                } else if (i == pivotValue) {
                    E.add(i);
                } else {
                    G.add(i);
                }
            }

        result.add(L);
        result.add(E);
        result.add(G);
        return result;
    }

    //Input: ArrayList of integer objects
    //Output/return: randomly chosen index value between 0 and the size of the list.
    //Hint: use the Random class from java.util, along with the nextInt method.
    private static int pick(ArrayList<Integer> list) {
        Random r = new Random();
        int sizeOfList = size(list);
        if(sizeOfList == 0) return 0;
        else return r.nextInt(size(list));
    }


    //Input: ArrayList of integer objects
    //Output/return: size of a list.
    private static int size(ArrayList<Integer> list) {
        return list.size();
    }
}
```
***
## Week 12: Sorting
## Graphs (Depth-First & Breadth-First Search, Minimum Spanning Tree, Dijkstra's Algorithm) & Review Week
![Week 12 Graphs Assignment](Week12Module/Week12Assignment.png)
***
## Week 13: Final Project
## Running Log w/ Java FX
[Seperate Repo](https://github.com/zachsarc/CS-152-Final-Project)

# You've Reached the end. Thank You!!

