package thread;

/**
 * @author kshitijbaluni
 * @since 9 July 2022
 */
public class CoreJavaThreadRunnable implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("I am in " + Thread.currentThread().getName() + " count " + i);
    }
  }
}
