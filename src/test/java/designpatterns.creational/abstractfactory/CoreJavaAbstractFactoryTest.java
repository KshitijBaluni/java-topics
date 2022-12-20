package designpatterns.creational.abstractfactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreJavaAbstractFactoryTest {
  private CoreJavaAbstractFactory coreJavaAbstractFactory;

  @Before
  public void init() {
    coreJavaAbstractFactory = new CoreJavaAbstractFactory();
  }

  @Test
  public void testAbstractFactory() {
    coreJavaAbstractFactory.setProfession(AbstractFactory.ProfessionTypes.ENGINEER, false);
    Profession profession = coreJavaAbstractFactory.getProfession();
//    profession.print();
    Assert.assertTrue(profession instanceof Engineer);

    coreJavaAbstractFactory.setProfession(AbstractFactory.ProfessionTypes.TEACHER, false);
    Assert.assertTrue(coreJavaAbstractFactory.getProfession() instanceof Teacher);

    coreJavaAbstractFactory.setProfession(AbstractFactory.ProfessionTypes.TRAINEE_TEACHER, true);
    Assert.assertTrue(coreJavaAbstractFactory.getProfession() instanceof TraineeTeacher);

    coreJavaAbstractFactory.setProfession(AbstractFactory.ProfessionTypes.TRAINEE_ENGINEER, true);
    Assert.assertTrue(coreJavaAbstractFactory.getProfession() instanceof TraineeEngineer);
  }
}
