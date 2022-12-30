package programs.sorting;

import org.junit.Test;
import programs.Sorting.SortingProgram;

public class SortingProgramTest {
    SortingProgram sortingProgram=new SortingProgram();

    @Test
    public void loopSort(){
        int[] arr={3,5,2,6,8,7};
        sortingProgram.loopSort(arr);


    }
}
