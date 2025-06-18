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
