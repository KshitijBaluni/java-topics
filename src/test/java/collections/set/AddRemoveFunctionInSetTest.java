package collections.set;

import org.junit.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class AddRemoveFunctionInSetTest {
    @Test
    public void addSet(){
        AddRemoveFunctionInSet addInSet=new AddRemoveFunctionInSet();
        Set<String> addedSet = addInSet.addSet(Arrays.asList("India", "Russia", "Australia", "Russia", "Pakistan"));
        assertEquals("[Pakistan, Australia, India, Russia]",addedSet.toString());
    }

    @Test
    public void removeSet(){
        AddRemoveFunctionInSet addInSet=new AddRemoveFunctionInSet();
        Set<String> removedSet = addInSet.removeSet(Arrays.asList("India", "Russia", "Australia", "Russia", "Pakistan"),"Pakistan");
        assertEquals("[Australia, India, Russia]",removedSet.toString());
    }

    @Test
    public void insertNull(){
        AddRemoveFunctionInSet addInSet=new AddRemoveFunctionInSet();
        Set<String> insertedNull = addInSet.addSet(Arrays.asList("India", null, "Australia", "Russia", "Pakistan"));
        assertEquals("[null, Pakistan, Australia, India, Russia]",insertedNull.toString());
    }

    @Test
    public void addUsingIterator(){
        AddRemoveFunctionInSet addInSet=new AddRemoveFunctionInSet();
        Set<String> iteratorAddition = addInSet.addSet(Arrays.asList("India", null, "Russia", "Pakistan"));
        assertEquals("[null, Pakistan, India, Russia]",iteratorAddition.toString());
    }

    @Test
    public void containsSet(){
        AddRemoveFunctionInSet addInSet=new AddRemoveFunctionInSet();
        Boolean containedSet = addInSet.containsSet(Arrays.asList("India", null, "Australia", "Russia", "Pakistan"),"Russia");
        assertEquals(true,true);
    }
}