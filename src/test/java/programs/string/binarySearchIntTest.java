package programs.string;

import org.junit.Test;
import programs.BinarySearchInt;

import static org.junit.Assert.assertEquals;

public class binarySearchIntTest {
    @Test
    public void binarySearchIntArr(){
        int[] arr={4,6,12,15,18,25,34};
        BinarySearchInt binarySearchInt=new BinarySearchInt();
        int index=binarySearchInt.binarySearchIntArr(arr,0,arr.length-1,18);
        assertEquals(4, index);
    }
}
