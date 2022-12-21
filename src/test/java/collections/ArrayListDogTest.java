package collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ArrayListDogTest {
    @Test
    public void dogClassTest() {
        List<ArrayListDog.Dog> al = new ArrayList<>();
        al.add(new ArrayListDog.Dog("Beagle"));
        al.add(new ArrayListDog.Dog("Husky"));
        al.add(new ArrayListDog.Dog("Spaniel"));
        ArrayListDog.Dog a = al.get(0);
        assertEquals("Beagle", a.breed);
        assertNotEquals("Bagula", a.breed);
    }
}