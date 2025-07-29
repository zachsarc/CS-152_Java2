import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                MyStack<Integer> stack = new MyStack<>();
                MyQueue<Integer> queue = new MyQueue<>();

                while (true) {
                    System.out.println("Enter the integers of your stack one-by-one, when you're done type \"done\": ");
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
                System.out.println("The minimum element in the stack is: " + stack.getMin());
                stack.displaySorted();

                // Queue Portion
                while (true) {
                    System.out.println("Enter the integers of your queue one-by-one, when you're done type \"done\": ");
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
                System.out.println("The minimum element in the queue is: " + queue.getMin());
                System.out.println("Next, here is your sorted queue: ");
                queue.getMin();
                queue.displaySorted();

                sc.close();
        }
    }

    /* OUTPUT
Enter the integers of your stack one-by-one, when you're done type "done":
4
You entered: 4
Stack: [4]
Enter the integers of your stack one-by-one, when you're done type "done":
8
You entered: 8
Stack: [8, 4]
Enter the integers of your stack one-by-one, when you're done type "done":
9
You entered: 9
Stack: [9, 8, 4]
Enter the integers of your stack one-by-one, when you're done type "done":
done
Next, here is your sorted stack:
The minimum element in the stack is: 4
Sorted Stack: [4, 8, 9]
Enter the integers of your queue one-by-one, when you're done type "done":
2
You entered: 2
Queue: [2]
Enter the integers of your queue one-by-one, when you're done type "done":
1
You entered: 1
Queue: [2, 1]
Enter the integers of your queue one-by-one, when you're done type "done":
4
You entered: 4
Queue: [2, 1, 4]
Enter the integers of your queue one-by-one, when you're done type "done":
done
The minimum element in the queue is: 1
Next, here is your sorted queue:
Sorted Queue: [1, 2, 4]
     */