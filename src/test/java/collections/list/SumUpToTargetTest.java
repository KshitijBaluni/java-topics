package collections.list;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SumUpToTargetTest {
    @Test
    public void findIndex(){
        int[]arr={4,5,7,2,8,5,9,11};
        int []indexes={0,6};
        SumUpToTarget sumUpToTarget=new SumUpToTarget();
        int[]ind=sumUpToTarget.findIndex(arr,13);
        assertTrue(Arrays.equals(indexes, ind));

    }
    @Test
    public void findIndexNegative(){
        int[]arr={4,5,7,2,8,5,9,11};
        int []indexes={-1,-1};
        SumUpToTarget sumUpToTarget=new SumUpToTarget();
        int[]ind=sumUpToTarget.findIndex(arr,66);
        assertTrue(Arrays.equals(indexes, ind));

    }

    @Test
    public void findIndexWithoutNest(){
        int[]arr={4,5,7,2,8,5,9,11};
        int []indexes={4,0};
        SumUpToTarget sumUpToTarget=new SumUpToTarget();
        int[]ind=sumUpToTarget.findIndexWithoutNest(arr,12);
        assertTrue(Arrays.equals(indexes, ind));
    }
}
