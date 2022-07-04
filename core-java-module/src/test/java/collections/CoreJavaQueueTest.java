package collections;

import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Set;

import static java.util.Optional.ofNullable;
import static org.junit.Assert.assertEquals;

public class CoreJavaQueueTest {
  CoreJavaQueue<Integer> coreJavaQueue;

  @Before
  public void init() {
    coreJavaQueue = new CoreJavaQueue<Integer>(new PriorityQueue<>(Set.of(1, 2, 3)));
  }

  @Test
  public void testPriorityQueue() {
    assertEquals(ofNullable(1), ofNullable(coreJavaQueue.getPriorityQueue().peek()));
    assertEquals(ofNullable(1), ofNullable(coreJavaQueue.getPriorityQueue().poll()));
  }
}
