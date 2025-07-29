import java.util.ArrayList;

public class MergeSortMain {

    public static void main(String [] args) {
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
        theList = mergeSort(theList);
        System.out.println(theList);
    }

    private static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        if(size(list)>1) {
            ArrayList<ArrayList<Integer>> splitList = partition(list, size(list)/2);
            ArrayList<Integer> list1 = mergeSort(splitList.get(0));
            ArrayList<Integer> list2 = mergeSort(splitList.get(1));
            list = merge(list1,list2);
        }
        return list;
    }

    private static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> combinedList = new ArrayList<Integer>();
        while(!isEmpty(list1) && !isEmpty(list2)){
            if(first(list1) < first(list2)) {
                addLast(combinedList,remove(list1,0));
            }else {
                addLast(combinedList,remove(list2,0));
            }
        }
        while(!isEmpty(list1)){
            addLast(combinedList,remove(list1,0));
        }
        while(!isEmpty(list2)){
            addLast(combinedList,remove(list2,0));
        }
        return combinedList;
    }

    private static int size(ArrayList<Integer> list) {
        return list.size();
    }
    private static boolean isEmpty(ArrayList<Integer> list) {
        return list.isEmpty();
    }
    private static int first(ArrayList<Integer> list) {
        return list.get(0);
    }
    private static int remove(ArrayList<Integer> list, int index) {
        return(list.remove(index));
    }
    private static void addLast(ArrayList<Integer> list, int item) {
        list.add(list.size(),item);
    }
    private static ArrayList<ArrayList<Integer>> partition(ArrayList<Integer> list,int index){
        ArrayList <Integer> list1 = new ArrayList<Integer>(list.subList(0, index));
        ArrayList <Integer> list2 = new ArrayList<Integer>(list.subList(index, size(list)));
        ArrayList <ArrayList<Integer>> retVal = new ArrayList<ArrayList<Integer>>();
        retVal.add(list1);
        retVal.add(list2);
        return retVal;
    }

}