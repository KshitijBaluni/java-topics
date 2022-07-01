package collections;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CoreJavaListTest {
  private CoreJavaList coreJavaList;

  @Test
  public void getListTest() {
    coreJavaList = new CoreJavaList<Integer>();

    coreJavaList.setArrayList(Arrays.asList(1, 2, 3));
    coreJavaList.setLinkedList(Arrays.asList(3, 4, 5));
    coreJavaList.setVector(Arrays.asList(1, 2, 3));
    coreJavaList.setStack(Arrays.asList(1, 2, 3));

    assertEquals(Arrays.asList(1, 2, 3), coreJavaList.getList(coreJavaList.getArrayList()));
    assertEquals(Arrays.asList(3, 4, 5), coreJavaList.getList(coreJavaList.getLinkedList()));
    assertEquals(Arrays.asList(1, 2, 3), coreJavaList.getList(coreJavaList.getVector()));
    assertEquals(Arrays.asList(1, 2, 3), coreJavaList.getList(coreJavaList.getStack()));

    assertFalse(Arrays.asList(1, 2).equals(coreJavaList.getList(coreJavaList.getArrayList())));
  }

}
