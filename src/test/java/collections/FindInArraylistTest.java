package collections;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

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
        FindInArraylist findInArraylist = new FindInArraylist(fia, 23);
        boolean result = findInArraylist.arrayFind();
        assertTrue(result);
    }

    @Test
    public void arrayFindParamFunction() {
        ArrayList<Integer> fia
                = new ArrayList<Integer>();
        fia.add(2);
        fia.add(4);
        fia.add(7);
        fia.add(9);
        fia.add(23);
        FindInArraylist findInArraylist = new FindInArraylist(fia, 23);
        boolean result = findInArraylist.arrayFind(fia,23);
        assertTrue(result);
    }
    @Test
    public void arrayFindForEach() {
        ArrayList<Integer> fia
                = new ArrayList<Integer>();
        fia.add(2);
        fia.add(4);
        fia.add(7);
        fia.add(9);
        fia.add(23);
        FindInArraylist findInArraylist = new FindInArraylist(fia, 23);
        boolean result =findInArraylist.findArrayForEach();
        assertTrue(result);
    }
    @Test
    public void arrayFindForEachParamFunc() {
        ArrayList<Integer> fia
                = new ArrayList<Integer>();
        fia.add(2);
        fia.add(4);
        fia.add(7);
        fia.add(9);
        fia.add(23);
        FindInArraylist findInArraylist = new FindInArraylist(fia, 23);
        boolean result =findInArraylist.findArrayForEach(fia,23);
        assertTrue(result);
    }
}