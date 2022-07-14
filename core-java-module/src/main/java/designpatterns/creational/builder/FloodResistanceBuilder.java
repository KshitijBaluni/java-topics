package designpatterns.creational.builder;

public class FloodResistanceBuilder implements  Builder{
  private Home floodResistanceHome = new Home();

  @Override
  public void buildFloor() {
    floodResistanceHome.floor = "10 Feets above ground level";
  }

  @Override
  public void buildWalls() {
    floodResistanceHome.wall = "Water resistance walls";
  }

  @Override
  public void buildTerrace() {
    floodResistanceHome.terrace = "water leakage resistance terrace";
  }

  @Override
  public Home getComplexObject() {
    return floodResistanceHome;
  }
}
