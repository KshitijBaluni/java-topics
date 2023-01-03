package collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestContiguousArrayTest {
    @Test
    public void largestSum(){
        int[] arr = { -1, -3, 4, -3, 2, -1, 3, -3 };
        LargestContiguousArray largestContiguousArray=new LargestContiguousArray();
        int sum=largestContiguousArray.largestSum(arr);
        assertEquals(5,sum);
    }
}
