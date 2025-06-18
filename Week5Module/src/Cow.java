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
