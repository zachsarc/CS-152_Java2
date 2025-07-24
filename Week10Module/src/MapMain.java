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