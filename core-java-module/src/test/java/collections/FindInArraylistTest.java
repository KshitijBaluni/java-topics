package collections;

import org.junit.Test;

import java.util.ArrayList;

public class FindInArraylistTest {
    @Test
    public void arrayFind() {
        ArrayList<Integer> fia
                = new ArrayList<Integer>();
        fia.add(2);
        fia.add(4);
        fia.add(7);
        fia.add(9);
        fia.add(23);
        FindInArraylist findInArraylist=new FindInArraylist(fia,23);
        boolean result=findInArraylist.arrayFind();

        if (result==true)
            System.out.println("element is present in the array");
        else
            System.out.println("Element is not present in array");
    }
}
