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
     * @return arr- sorted array
     */
    public int[] loopSort(int[]arr){
        for (int i=0; i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                int temp=0;
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
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