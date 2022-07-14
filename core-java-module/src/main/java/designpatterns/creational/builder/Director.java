package designpatterns.creational.builder;

public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public Home getComplexHomeObject() {
    return builder.getComplexObject();
  }

  public void manageRequiredHomeConstruction() {
    builder.buildFloor();
    builder.buildWalls();
    builder.buildTerrace();
  }
}
