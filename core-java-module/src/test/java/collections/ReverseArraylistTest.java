package collections;

import org.junit.Test;

import java.util.ArrayList;

public class ReverseArraylistTest {
    @Test
    public void reverseArraylist() {
        ReverseArraylist reverseArraylist=new ReverseArraylist();
        ArrayList<Integer> fia
                = new ArrayList<Integer>();
        fia.add(2);
        fia.add(4);
        fia.add(7);
        fia.add(9);
        fia.add(23);
        reverseArraylist.arrayListUsingIntegerArray(fia);
        for (int x: fia)
            System.out.println(x);
    }
}
