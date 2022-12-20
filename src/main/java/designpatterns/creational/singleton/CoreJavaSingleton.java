package designpatterns.creational.singleton;

import java.util.logging.Logger;

/***
 * Demo for Singleton Design Pattern.
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public class CoreJavaSingleton {
  private static CoreJavaSingleton coreJavaSingleton = new CoreJavaSingleton();
  private static final Logger LOGGER = Logger.getLogger(CoreJavaSingleton.class.getName());

  /**
   * Private constructor
   */
  private CoreJavaSingleton() {
  }

  /**
   * Get singleton object.
   *
   * @return CoreJavaSingleton object
   */
  public static CoreJavaSingleton getCoreJavaSingleton() {
    return coreJavaSingleton;
  }

  /**
   * Simple method to log the hashcode of the singleton object.
   */
  public void simpleMethod() {
    LOGGER.info("Hashcode of singleton object -" + coreJavaSingleton);
  }
}
