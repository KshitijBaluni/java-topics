package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ArrayListDogTest {
    @Test
    public void dog() {
        List<ArrayListDog.Dog> al = new ArrayList<>();
        al.add(new ArrayListDog.Dog("beagle"));
        al.add(new ArrayListDog.Dog("husky"));
        al.add(new ArrayListDog.Dog("Spaniel"));
        ArrayListDog.Dog a=al.get(0);
        assertEquals("beagle",a.breed);
        assertNotEquals("Bagula",a.breed);
        }
    }