package collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ReverseArraylistTest {
    @Test
    public void reverseArraylist() {
        ReverseArraylist reverseArraylist = new ReverseArraylist();
        ArrayList<Integer> fia
                = new ArrayList<Integer>();
        fia.add(2);
        fia.add(4);
        fia.add(7);
        fia.add(9);
        fia.add(23);
        ArrayList<Integer> arr = reverseArraylist.arrayListUsingIntegerArray(fia);
        assertEquals(Arrays.asList(23, 9, 7, 4, 2), arr);
    }
}
