package programs.sorting;

import org.junit.Test;
import programs.Sorting.SortingProgram;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SortingProgramTest {
    SortingProgram sortingProgram=new SortingProgram();

    @Test
    public void loopSort(){
        int[] arr={3,5,2,6,8,7};
        int[]arr1={2,3,5,6,7,8};
        int[] sortedArray=sortingProgram.loopSort(arr);
        assertEquals(Arrays.toString(arr1), Arrays.toString(sortedArray));
    }

    @Test
    public void arrSort(){
        int[] arr={3,5,2,6,8,7};
        int[]arr1={2,3,5,6,7,8};
        int[] sortedArray=sortingProgram.arrSort(arr);
        assertEquals(Arrays.toString(arr1), Arrays.toString(sortedArray));
    }
}