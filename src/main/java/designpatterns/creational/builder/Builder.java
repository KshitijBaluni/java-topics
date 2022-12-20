package designpatterns.creational.builder;

/**
 * Builder interface.
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public interface Builder {
  public void buildFloor();
  public void buildWalls();
  public void buildTerrace();
  public Home getComplexObject();
}
