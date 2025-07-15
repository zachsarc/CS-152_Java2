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