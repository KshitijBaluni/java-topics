package collections;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CoreJavaListTest {
  private CoreJavaList coreJavaList;

  @Before
  public void init() {
    coreJavaList = new CoreJavaList();
    coreJavaList.setArrayList(Arrays.asList(1, 2, 3));
    coreJavaList.setLinkedList(Arrays.asList(3, 4, 5));
    coreJavaList.setVector(Arrays.asList(1, 2, 3));
    coreJavaList.setStack(Arrays.asList(1, 2, 3));
  }

  @Test
  public void getListTest() {
    assertEquals(Arrays.asList(1, 2, 3), coreJavaList.getList(coreJavaList.getArrayList()));
    assertEquals(Arrays.asList(3, 4, 5), coreJavaList.getList(coreJavaList.getLinkedList()));
    assertEquals(Arrays.asList(1, 2, 3), coreJavaList.getList(coreJavaList.getVector()));
    assertEquals(Arrays.asList(1, 2, 3), coreJavaList.getList(coreJavaList.getStack()));

    assertFalse(Arrays.asList(1, 2).equals(coreJavaList.getList(coreJavaList.getArrayList())));
  }

  @Test
  public void addElementToListTest() {
    List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
    coreJavaList.setArrayList(list);
    coreJavaList.addElementToList(coreJavaList.getArrayList(), 4);

    assertEquals(Arrays.asList(1, 2, 3, 4), coreJavaList.getArrayList());

    coreJavaList.addElementToList(coreJavaList.getArrayList(), 8);
    assertEquals(Arrays.asList(1, 2, 3, 4, 8), coreJavaList.getArrayList());

    assertFalse(Arrays.asList(1, 2, 3, 4, 8, 9).equals(coreJavaList.getArrayList()));
  }

  @Test
  public void addElementsToListTest() {
    List<String> list = new LinkedList<>(List.of("test", "the", "function"));
    coreJavaList.setLinkedList(list);
    coreJavaList.addElementsToList(list, List.of("addElementsToList", "passed"));

    assertEquals(List.of("test", "the", "function", "addElementsToList", "passed"), coreJavaList.getLinkedList());
    assertFalse(List.of("test", "the", "function").equals(coreJavaList.getLinkedList()));
  }

  @Test
  public void removeElementFromListTest() {
    List<String> list = new Vector<>(List.of("test", "the", "function"));
    coreJavaList.setVector(list);
    coreJavaList.removeElementFromList(list, "the");

    assertEquals(List.of("test", "function"), coreJavaList.getVector());
    assertFalse(List.of("test", "the", "function").equals(coreJavaList.getVector()));
  }

  @Test
  public void removeElementsFromListTest() {
    List<Integer> list = new Stack<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    coreJavaList.setStack(list);
    coreJavaList.removeElementsFromList(list, List.of(1, 2));
    assertEquals(List.of(3, 4, 5), coreJavaList.getStack());
    assertFalse(List.of(1).equals(coreJavaList.getStack()));
  }

  @Test
  public void clearListTest() {
    List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));
    coreJavaList.setArrayList(list);
    coreJavaList.clearList(list);

    assertEquals(List.of(), coreJavaList.getArrayList());
    assertFalse(List.of(1).equals(coreJavaList.getArrayList()));
  }
}
