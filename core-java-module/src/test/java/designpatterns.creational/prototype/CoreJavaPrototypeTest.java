package designpatterns.creational.prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreJavaPrototypeTest {
  private CoreJavaPrototype coreJavaPrototype;

  @Before
  public void init() throws CloneNotSupportedException {
    ProfessionCache.loadProfessionCache();
    coreJavaPrototype = new CoreJavaPrototype(ProfessionCache.getClonedProfession(1));
  }

  @Test
  public void testPrototype() throws CloneNotSupportedException {
    Assert.assertFalse(coreJavaPrototype.getProfession().equals(ProfessionCache.getClonedProfession(1)));
    coreJavaPrototype.getProfession().print();
    coreJavaPrototype.getProfession().getName();

    coreJavaPrototype.setProfession(ProfessionCache.getClonedProfession(2));
    Assert.assertFalse(coreJavaPrototype.getProfession().equals(ProfessionCache.getClonedProfession(2)));
    coreJavaPrototype.getProfession().print();
    coreJavaPrototype.getProfession().getName();

    coreJavaPrototype.setProfession(ProfessionCache.getClonedProfession(3));
    Assert.assertFalse(coreJavaPrototype.getProfession().equals(ProfessionCache.getClonedProfession(3)));
    coreJavaPrototype.getProfession().print();
    coreJavaPrototype.getProfession().getName();
  }
}
