package collections;

import org.junit.Test;

import java.util.ArrayList;

public class FindElementInArraylistTest {
    @Test
    public void arrayFind() {

        FindElementInArraylist findElementInArraylist=new FindElementInArraylist();
        ArrayList<Integer> fia = new ArrayList<Integer>();
        fia.add(2);
        fia.add(4);
        fia.add(7);
        fia.add(9);
        fia.add(23);
        int index=findElementInArraylist.arrayFind(fia, 7);
        System.out.println("Element is present in  "+index);
    }
}