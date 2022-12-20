package designpatterns.creational.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreJavaSingletonTest {
  private CoreJavaSingleton coreJavaSingleton;

  @Before
  public void init() {
    coreJavaSingleton = CoreJavaSingleton.getCoreJavaSingleton();
  }

  @Test
  public void testSingletonPattern() {
    Assert.assertEquals(coreJavaSingleton, CoreJavaSingleton.getCoreJavaSingleton());
    Assert.assertEquals(coreJavaSingleton.hashCode(), CoreJavaSingleton.getCoreJavaSingleton().hashCode());
    coreJavaSingleton.simpleMethod();
  }
}
