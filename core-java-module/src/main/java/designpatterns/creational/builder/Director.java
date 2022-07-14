package designpatterns.creational.builder;

/**
 * Director class
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public class Director {
  private Builder builder;

  /**
   * Director Constructor.
   *
   * @param builder builder object
   */
  public Director(Builder builder) {
    this.builder = builder;
  }

  /**
   * Get Complex Home Obect.
   *
   * @return Home object
   */
  public Home getComplexHomeObject() {
    return builder.getComplexObject();
  }

  /**
   * Manges the required work that needs for construction.
   */
  public void manageRequiredHomeConstruction() {
    builder.buildFloor();
    builder.buildWalls();
    builder.buildTerrace();
  }
}
