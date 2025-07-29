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
                System.out.println("The minimum element in the stack is: " + queue.getMin());
                System.out.println("Next, here is your sorted queue: ");
                queue.getMin();
                queue.displaySorted();

                sc.close();
        }
    }

    /* OUTPUT
/Library/Java/JavaVirtualMachines/jdk-24.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=53467 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/zmlaric/IdeaProjects/CS-152_Java2/out/production/Week9Module Main
Enter the integers of your stack one-by-one, when you're done type "done":
4
You entered: 4
Stack: [4]
Enter the integers of your stack one-by-one, when you're done type "done":
9
You entered: 9
Stack: [9, 4]
Enter the integers of your stack one-by-one, when you're done type "done":
6
You entered: 6
Stack: [6, 9, 4]
Enter the integers of your stack one-by-one, when you're done type "done":
done
Next, here is your sorted stack:
The minimum element in the stack is: 4
Sorted Stack: [4, 6, 9]
Enter the integers of your queue one-by-one, when you're done type "done":
4
You entered: 4
Queue: [4]
Enter the integers of your queue one-by-one, when you're done type "done":
1
You entered: 1
Queue: [4, 1]
Enter the integers of your queue one-by-one, when you're done type "done":
23
You entered: 23
Queue: [4, 1, 23]
Enter the integers of your queue one-by-one, when you're done type "done":
done
The minimum element in the stack is: 1
Next, here is your sorted queue:
Sorted Queue: [1, 4, 23]
     */