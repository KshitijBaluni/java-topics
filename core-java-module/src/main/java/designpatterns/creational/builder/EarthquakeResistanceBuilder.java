package designpatterns.creational.builder;

public class EarthquakeResistanceBuilder implements Builder {
  private Home earthquakeResistanceHome = new Home();

  @Override
  public void buildFloor() {
    earthquakeResistanceHome.floor = "Wooden Floor";
  }

  @Override
  public void buildWalls() {
    earthquakeResistanceHome.wall = "Wooden walls";
  }

  @Override
  public void buildTerrace() {
    earthquakeResistanceHome.terrace = "Wooden terrace";
  }

  @Override
  public Home getComplexObject() {
    return earthquakeResistanceHome;
  }
}
