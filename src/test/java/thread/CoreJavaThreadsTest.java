package thread;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreJavaThreadsTest {
  private CoreJavaThreads coreJavaThreads;

  @Before
  public void init() {
    coreJavaThreads = new CoreJavaThreads();
  }

  @Test
  public void testRunForCoreJavaThread() {
    coreJavaThreads.start();
    Assert.assertTrue(coreJavaThreads.isAlive());

    coreJavaThreads.setName(String.format("%s%s", CoreJavaThreads.class.getName(), coreJavaThreads.hashCode()));
    Assert.assertEquals(
      String.format("%s%s", CoreJavaThreads.class.getName(), coreJavaThreads.hashCode()),
      coreJavaThreads.getName()
    );
  }
}
