package collections;

import org.junit.Before;

import java.util.PriorityQueue;

public class CoreJavaQueueTest {
  CoreJavaQueue<Integer> coreJavaQueue;

  @Before
  public void init() {
    coreJavaQueue = new CoreJavaQueue<Integer>(new PriorityQueue<>());
  }
}
