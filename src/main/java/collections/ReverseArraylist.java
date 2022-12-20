package collections;

import java.util.ArrayList;

/**
 * reverse element of Arraylist
 *
 * @author Ankit Rawat
 * @since 16 Dec 2022
 */
public class ReverseArraylist {

    /**
     * Reverse Arraylist using 2nd arraylist
     *
     * @param arr-arraylist
     * @return arr- reverse arraylist
     */
    public ArrayList<Integer> reverseArraylist(ArrayList<Integer> arr) {
        ArrayList<Integer> reverseArrayList = new ArrayList<Integer>(arr);
        Object[] arr2 = arr.toArray();
        int z = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            arr.remove(z);
            arr.add(z, reverseArrayList.get(i));
            z++;
        }
        return arr;
    }

    /**
     * Reverse Arraylist using 2nd Integer array
     *
     * @param arr-arraylist
     * @return arr- reverse arraylist
     */
    public ArrayList<Integer> arrayListUsingIntegerArray(ArrayList<Integer> arr) {
        int[] inrArray = new int[arr.size()];
        int z = 0;
        for (int x : arr) {
            inrArray[z++] = x;
        }
        for (int c = 0; c < arr.size(); c++) {
            arr.remove(c);
            arr.add(c, inrArray[inrArray.length - 1 - c]);
        }
        return arr;
    }
}
