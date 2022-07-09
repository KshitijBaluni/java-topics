package thread;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreJavaThreadRunnableTest {
  private CoreJavaThreadRunnable coreJavaThreadRunnable;

  @Before
  public void init() {
    coreJavaThreadRunnable = new CoreJavaThreadRunnable();
  }

  @Test
  public void testCoreJavaThreadRunnable() {
    Thread thread = new Thread(coreJavaThreadRunnable);
    thread.start();

    Assert.assertTrue(thread.isAlive());
    thread.setName(String.format("%s%s", CoreJavaThreadRunnable.class.getName(), thread.hashCode()));
    Assert
      .assertEquals(String.format("%s%s", CoreJavaThreadRunnable.class.getName(), thread.hashCode()), thread.getName());

  }
}
