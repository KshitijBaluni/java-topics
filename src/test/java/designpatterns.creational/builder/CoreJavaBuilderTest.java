package designpatterns.creational.builder;

import org.junit.Assert;
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
    Assert.assertEquals("Wooden Floor", home.getFloor());
    Assert.assertEquals("Wooden walls", home.getWall());
    Assert.assertEquals("Wooden terrace", home.getTerrace());

    coreJavaBuilder.setDirector(new Director(new FloodResistanceBuilder()));
    director = coreJavaBuilder.getDirector();
    home = director.getComplexHomeObject();
    director.manageRequiredHomeConstruction();
    Assert.assertEquals("10 Feets above ground level", home.getFloor());
    Assert.assertEquals("Water resistance walls", home.getWall());
    Assert.assertEquals("water leakage resistance terrace", home.getTerrace());

  }
}
