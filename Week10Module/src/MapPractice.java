import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();

        System.out.println(mp.isEmpty());
        mp.put(5, "X");
        mp.put(7, "F");
        mp.put(2, "C");
        System.out.println("Contents: " + mp);
        mp.put(8, "D");
        System.out.println("Contents: " + mp);
        mp.put(2, "E");
        System.out.println("Contents: " + mp);
        System.out.println(mp.get(7));
        mp.put(7, "Y");
        System.out.println("Contents: " + mp);
        System.out.println(mp.get(4));
        mp.put(4, "X");
        System.out.println("Contents: " + mp);
        System.out.println(mp.get(4));
        System.out.println(mp.size());
        System.out.println(mp.remove(5));
        System.out.println("Contents: " + mp);
        System.out.println(mp.isEmpty());
        System.out.println(mp.size());
    }
}
