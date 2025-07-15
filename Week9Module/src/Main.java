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

    /* OUTPUT
    Enter the integers of your stack one-by-one, when your done type "done":
2
You entered: 2
Stack: [2]
Enter the integers of your stack one-by-one, when your done type "done":
56
You entered: 56
Stack: [56, 2]
Enter the integers of your stack one-by-one, when your done type "done":
12
You entered: 12
Stack: [12, 56, 2]
Enter the integers of your stack one-by-one, when your done type "done":
356
You entered: 356
Stack: [356, 12, 56, 2]
Enter the integers of your stack one-by-one, when your done type "done":
done
Next, here is your sorted stack:
Sorted Stack: [2, 12, 56, 356]
Enter the integers of your queue one-by-one, when your done type "done":
4
You entered: 4
Queue: [4]
Enter the integers of your queue one-by-one, when your done type "done":
7
You entered: 7
Queue: [4, 7]
Enter the integers of your queue one-by-one, when your done type "done":
1
You entered: 1
Queue: [4, 7, 1]
Enter the integers of your queue one-by-one, when your done type "done":
34
You entered: 34
Queue: [4, 7, 1, 34]
Enter the integers of your queue one-by-one, when your done type "done":
done
Next, here is your sorted queue:
Sorted Queue: [1, 4, 7, 34]

     */