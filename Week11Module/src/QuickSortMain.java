
import java.util.ArrayList;
import java.util.Random;

public class QuickSortMain {

    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> theList = new ArrayList<Integer>();
        theList.add(3);
        theList.add(7);
        theList.add(44);
        theList.add(23);
        theList.add(11);
        theList.add(55);
        theList.add(43);
        theList.add(55);
        theList.add(43);
        theList.add(51);
        theList.add(41);
        theList.add(52);
        theList.add(43);
        theList.add(13);
        System.out.println(theList);
        theList = quickSort(theList);
        System.out.println(theList);
    }


    //Input: ArrayList list of Integer objects, presumably unordered.
    //Output/return: ArrayList of the Integer objects from the input list, but ordered.
    //General Algorithm:
    //If list is empty, return list
    //Otherwise:
    //	-Pick a pivot integer, using the pick method
    //	-partition the list into sub-lists L, E & G (use partitionQ method)
    //	-Call quicksort on the L sub list
    //	-Call quicksort on the G sub list
    //	-Add each element from L, E & G (in that order) to the ArrayList to be returned.
    //	-Return the ArrayList that contains the combined L, E & G ArrayLists
    private static ArrayList<Integer> quickSort(ArrayList<Integer> list) {
        ArrayList<Integer> sortedList = new ArrayList<>();
        if (list.isEmpty()) {
            return list;
        }
        int pivot = pick(list);
        ArrayList<ArrayList<Integer>> partitioned = partitionQ(list, pivot);
        ArrayList<Integer> L = partitioned.get(0);
        ArrayList<Integer> E = partitioned.get(1);
        ArrayList<Integer> G = partitioned.get(2);

        ArrayList<Integer> sortedL = quickSort(L);
        ArrayList<Integer> sortedG = quickSort(G);

        sortedList.addAll(sortedL);
        sortedList.addAll(E);
        sortedList.addAll(sortedG);
        return sortedList;
    }

    //Input: ArrayList list of an Integer object; pivotIndex which is the index for the pivot Integer
    //Output/return: ArrayList of 3 ArrayLists, L E & G
    //			L: ArrayList of Integer objects with values less than the pivot Integer value
    //			E: ArrayList of Integer objects with values equal to the pivot Integer value (just 1 Integer object for unique lists)
    //			G: ArrayList of Integer objects with values greater than the pivot Integer value
    //			NOTE: pivot Integer value is NOT the pivot index.
    //			NOTE: L is added to the return value first, followed by E, then G.
    private static ArrayList<ArrayList<Integer>> partitionQ(ArrayList<Integer> list,int pivotIndex){
        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> E = new ArrayList<>();
        ArrayList<Integer> G = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int pivotValue = list.get(pivotIndex);

            for (int i : list) {
                if (i < pivotValue) {
                    L.add(i);
                } else if (i == pivotValue) {
                    E.add(i);
                } else {
                    G.add(i);
                }
            }

        result.add(L);
        result.add(E);
        result.add(G);
        return result;
    }

    //Input: ArrayList of integer objects
    //Output/return: randomly chosen index value between 0 and the size of the list.
    //Hint: use the Random class from java.util, along with the nextInt method.
    private static int pick(ArrayList<Integer> list) {
        Random r = new Random();
        int sizeOfList = size(list);
        if(sizeOfList == 0) return 0;
        else return r.nextInt(size(list));
    }


    //Input: ArrayList of integer objects
    //Output/return: size of a list.
    private static int size(ArrayList<Integer> list) {
        return list.size();
    }
}