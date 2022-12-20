package designpatterns.creational.builder;

/**
 * Concrete Builder for FloodResistance Home.
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public class FloodResistanceBuilder implements  Builder{
  private Home floodResistanceHome = new Home();

  @Override
  public void buildFloor() {
    floodResistanceHome.setFloor("10 Feets above ground level");
  }

  @Override
  public void buildWalls() {
    floodResistanceHome.setWall("Water resistance walls");
  }

  @Override
  public void buildTerrace() {
    floodResistanceHome.setTerrace("water leakage resistance terrace");
  }

  @Override
  public Home getComplexObject() {
    return floodResistanceHome;
  }
}
