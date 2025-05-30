import java.util.Scanner;

public class RunningLog {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of runs that you went on: ");
        int numberOfRuns = sc.nextInt();
        double distance;
        double totalDistance = 0;
        double time;
        double totalTime = 0;
        double averagePace;

        for (int i = 0; i < numberOfRuns; ++i) {
            System.out.println("How long was the distance in miles? (Use Decimal Format): ");
            distance = sc.nextDouble();
            if (distance <= 0){
                System.out.println("Please enter a valid value, Please try again");
                i--;
                continue;
            }
            totalDistance += distance;
            System.out.println("What was the time in minutes? (Use Decimal Format): ");
            time = sc.nextDouble();
            if (time <= 0){
                System.out.println("Please enter a value higher than 0, Please try again");
                i--;
                continue;
            }
            totalTime += time;


        }
        averagePace = totalTime / totalDistance;
        System.out.println("You're Average Pace Was " + averagePace + " Minutes");

        sc.close();
    }
}
