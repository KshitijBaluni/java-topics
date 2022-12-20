package stream;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CoreJavaStreamTest {

  @Test
  public void testMapStreamIntermediateOperations() throws NoSuchMethodException, InvocationTargetException,
    IllegalAccessException {
    CoreJavaStream coreJavaStream = new CoreJavaStream();
    Method method = CoreJavaStream.class.getDeclaredMethod(
      "mapStreamIntermediateOperations",
      List.class
    );
    method.setAccessible(true);
    List list = Arrays.asList(2, 4, 3, 9);
    List result = (List) method.invoke(coreJavaStream, list);
    assertEquals(Arrays.asList(4, 16, 9, 81), result);

    list = Arrays.asList();
    result = (List) method.invoke(coreJavaStream, list);
    assertEquals(Arrays.asList(), result);

    list = Arrays.asList(0, 0);
    result = (List) method.invoke(coreJavaStream, list);
    assertEquals(Arrays.asList(0, 0), result);
  }

  @Test
  public void testFilterStreamIntermediateOperations() throws NoSuchMethodException, InvocationTargetException,
    IllegalAccessException {
    CoreJavaStream coreJavaStream = new CoreJavaStream();
    Method method = CoreJavaStream.class.getDeclaredMethod("filterStreamIntermediateOperations", List.class);
    method.setAccessible(true);
    assertEquals(
      Arrays.asList(4, 2, 6, 8, 4), (List) method.invoke(coreJavaStream, Arrays.asList(4, 5, 2, 6, 7, 8, 4)));
    assertEquals(
      Arrays.asList(), (List) method.invoke(coreJavaStream, Arrays.asList()));
    assertEquals(
      Arrays.asList(0), (List) method.invoke(coreJavaStream, Arrays.asList(0)));
  }

  @Test
  public void testSortedStreamIntermediateOperations() throws NoSuchMethodException, InvocationTargetException,
    IllegalAccessException {
    CoreJavaStream coreJavaStream = new CoreJavaStream();
    Method method = CoreJavaStream.class.getDeclaredMethod("sortedStreamIntermediateOperations", List.class);
    method.setAccessible(true);
    assertEquals(Arrays.asList(2, 3, 5, 5, 8, 9), method.invoke(coreJavaStream, Arrays.asList(5, 8, 3, 9, 2, 5))
    );
  }

  @Test
  public void testCollectStreamTerminateOperation() throws NoSuchMethodException, InvocationTargetException,
    IllegalAccessException {
    CoreJavaStream coreJavaStream = new CoreJavaStream();
    Method method = CoreJavaStream.class.getDeclaredMethod("collectStreamTerminateOperation", List.class);
    method.setAccessible(true);
    assertEquals(Arrays.asList(6, 12, 14, 16), method.invoke(coreJavaStream, Arrays.asList(3, 6, 7, 8)));
  }

  @Test
  public void testForEachStreamTerminateOperation() throws NoSuchMethodException, InvocationTargetException,
    IllegalAccessException {
    CoreJavaStream coreJavaStream = mock(CoreJavaStream.class);
    Method method = CoreJavaStream.class.getDeclaredMethod("forEachStreamTerminateOperation", List.class);
    method.setAccessible(true);
    method.invoke(coreJavaStream, Arrays.asList(2,4,3));
    verify(coreJavaStream, times(1));
  }

  @Test
  public void testReduceStreamTerminateOperation() throws NoSuchMethodException, InvocationTargetException,
    IllegalAccessException {
    CoreJavaStream coreJavaStream = new CoreJavaStream();
    Method method = CoreJavaStream.class.getDeclaredMethod("reduceStreamTerminateOperation", List.class);
    method.setAccessible(true);
    assertEquals(8, method.invoke(coreJavaStream, Arrays.asList(2, 2, 4, 3, 2, 6)));
  }
}
