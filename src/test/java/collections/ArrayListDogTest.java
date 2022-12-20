package collections;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayListDogTest {
    public static void main(String[] args) {




        List<ArrayListDog.Dog> al = new ArrayList<>();
        al.add(new ArrayListDog.Dog("beagle"));
        al.add(new ArrayListDog.Dog("husky"));
        al.add(new ArrayListDog.Dog("Spaniel"));
        for (ArrayListDog.Dog a : al) {

            System.out.println(a.getBreed());
        }

        }
    }