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
  private Queue<T> arrayQueue;

  /**
   * Default Constructor.
   */
  public CoreJavaQueue() {
  }

  /**
   * Parameterised Constructor.
   *
   * @param priorityQueue
   * @param arrayQueue
   */
  public CoreJavaQueue(Queue<T> priorityQueue, Queue<T> arrayQueue) {
    this.priorityQueue = priorityQueue;
    this.arrayQueue = arrayQueue;
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

  /**
   * Return Array Queue.
   *
   * @return arrayQueue
   */
  public Queue<T> getArrayQueue() {
    return arrayQueue instanceof ArrayQueue ? arrayQueue : null;
  }

  /**
   * Set Array Queue.
   *
   * @param arrayQueue
   */
  public void setArrayQueue(Queue<T> arrayQueue) {
    if (arrayQueue instanceof ArrayQueue)
      this.arrayQueue = arrayQueue;
    else
      this.arrayQueue = null;
  }
}
