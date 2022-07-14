package designpatterns.creational.builder;

import org.junit.Before;
import org.junit.Test;

public class CoreJavaBuilderTest {
  private CoreJavaBuilder coreJavaBuilder;

  @Before
  public void init() {
    coreJavaBuilder = new CoreJavaBuilder(new Director(new EarthquakeResistanceBuilder()));
  }

  @Test
  public void testBuilder() {
    Director director = coreJavaBuilder.getDirector();
    Home home = director.getComplexHomeObject();
    director.manageRequiredHomeConstruction();
    System.out.println(home.floor);
    System.out.println(home.terrace);
    System.out.println(home.wall);
  }
}
