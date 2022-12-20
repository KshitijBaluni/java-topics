package designpatterns.creational.builder;

/**
 * Concrete class for Earthquake Resistance Home.
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public class EarthquakeResistanceBuilder implements Builder {
  private Home earthquakeResistanceHome = new Home();

  @Override
  public void buildFloor() {
    earthquakeResistanceHome.setFloor("Wooden Floor");
  }

  @Override
  public void buildWalls() {
    earthquakeResistanceHome.setWall("Wooden walls");
  }

  @Override
  public void buildTerrace() {
    earthquakeResistanceHome.setTerrace("Wooden terrace");
  }

  @Override
  public Home getComplexObject() {
    return earthquakeResistanceHome;
  }
}
