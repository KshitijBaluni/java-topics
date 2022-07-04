package collections;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.PriorityQueue;
import java.util.Queue;

/***
 * Core Java Queue Demo
 *
 * @author kshitijbaluni
 * @since 4 July 2022
 */
public class CoreJavaQueue<T> {
  private Queue<T> priorityQueue;

  /**
   * Default Constructor.
   */
  public CoreJavaQueue() {
  }

  /**
   * Parameterised Constructor.
   *
   * @param priorityQueue
   */
  public CoreJavaQueue(Queue<T> priorityQueue) {
    this.priorityQueue = priorityQueue;
  }

  /**
   * Return Priority Queue.
   *
   * @return queue
   */
  public Queue<T> getPriorityQueue() {
    return priorityQueue instanceof PriorityQueue ? priorityQueue : null;
  }

  /**
   * Set Priority Queue.
   *
   * @param priorityQueue
   */
  public void setPriorityQueue(Queue<T> priorityQueue) {
    if (priorityQueue instanceof PriorityQueue)
      this.priorityQueue = priorityQueue;
    else
      this.priorityQueue = null;
  }
}
