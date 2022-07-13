package designpatterns.creational.singleton;

public class CoreJavaSingleton {
  private static CoreJavaSingleton coreJavaSingleton = new CoreJavaSingleton();

  private CoreJavaSingleton() {
  }

  public static CoreJavaSingleton getCoreJavaSingleton() {
    return coreJavaSingleton;
  }
}
