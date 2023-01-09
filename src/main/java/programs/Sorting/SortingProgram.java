package programs.Sorting;

import java.util.Arrays;

/**
 * Sorting
 *
 * @author Ankit Rawat
 * @since 30 Dec 2022
 */
public class SortingProgram {

    /**
     * Sort using for loop
     *
     * @param arr-array to sort
     * @return arr-sorted array
     */
    public int[] loopSort(int[]arr){

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i+ 1];
                arr[i+ 1] = temp;
                i=-1;
            }
        }
        return arr;
    }

    /**
     * Sort using sort() method
     *
     * @param arr-array to sort
     * @return arr-sorted array
     */
    public int[] arrSort(int []arr){
        Arrays.sort(arr);
        return arr;
    }
}