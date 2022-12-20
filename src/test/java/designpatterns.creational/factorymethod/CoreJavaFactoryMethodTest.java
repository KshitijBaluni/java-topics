package designpatterns.creational.factorymethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CoreJavaFactoryMethodTest {
  private CoreJavaFactoryMethod coreJavaFactoryMethod;

  @Before
  public void init() {
    coreJavaFactoryMethod = new CoreJavaFactoryMethod(new ArrayList<>());
  }

 @Test
  public void testGetProfessionList() {
    List<Profession> professionList = coreJavaFactoryMethod.getProfessionList();
    for (Profession p : professionList) {
      p.print();
    }
    Assert.assertTrue(ProfessionFactory.getProfession(ProfessionFactory.ProfessionTypes.ENGINEER) instanceof Engineer);
    Assert.assertTrue(ProfessionFactory.getProfession(ProfessionFactory.ProfessionTypes.TEACHER) instanceof Teacher);
    Assert.assertTrue(ProfessionFactory.getProfession(ProfessionFactory.ProfessionTypes.DOCTOR) instanceof Doctor);
    Assert.assertTrue(ProfessionFactory.getProfession(null) == null);
  }
}
