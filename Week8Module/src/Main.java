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

/* OUTPUT
The collection contains [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

The sum of these elements are 30.0

The recursive adding these elements produces a total of 30.0

The mean of these numbers of the list [3, 6, 10, 4, 2, 5] is 5

The squared result of each of these numbers in the list [3, 6, 10, 4, 2, 5] is [9, 36, 100, 16, 4, 25]

 */