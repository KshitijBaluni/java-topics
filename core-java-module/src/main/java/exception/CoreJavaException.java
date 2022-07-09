package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Core Java Exception Demo.
 *
 * @author kshitijbaluni
 * @since 9 July 2022
 */
public class CoreJavaException {
  private final static Logger logger = Logger.getLogger(CoreJavaException.class.getName());

  /**
   * Demo for Null Pointer Exception.
   * Unchecked Exception.
   */
  public static void nullPointerException() {
    try {
      String testNull = null;
      testNull.toString();
    } catch (NullPointerException e) {
      logger.log(Level.INFO, e.getStackTrace().toString());
    }
  }

  /***
   * Demo for Arithmetic Exception.
   * Unchecked Exception.
   */
  public static void arithmeticException() {
    try {
      int a = 5 / 0;
    } catch (ArithmeticException e) {
      logger.log(Level.INFO, e.getStackTrace().toString());
    }
  }

  /***
   * Demo for ArrayIndexOutOfBoundException.
   * Unchecked Exception.
   */
  public static void arrayIndexOutOfBoundException() {
    try {
      int a[] = {1, 2, 3};
      a[3] = 1;
    } catch (ArrayIndexOutOfBoundsException e) {
      logger.log(Level.INFO, e.getStackTrace().toString());
    }
  }
}
