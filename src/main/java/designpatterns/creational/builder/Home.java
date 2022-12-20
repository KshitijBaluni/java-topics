package designpatterns.creational.builder;

/**
 * Home class.
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public class Home {
  private String floor;
  private String wall;
  private String terrace;

  /**
   * Get Floor.
   *
   * @return floor value
   */
  public String getFloor() {
    return floor;
  }

  /**
   * Set floor value.
   *
   * @param floor floor value
   */
  public void setFloor(String floor) {
    this.floor = floor;
  }

  /**
   * Get wall.
   * @return wall value
   */
  public String getWall() {
    return wall;
  }

  /**
   * Set wall value.
   *
   * @param wall wall value
   */
  public void setWall(String wall) {
    this.wall = wall;
  }

  /**
   * Get terrace.
   *
   * @return terrace value.
   */
  public String getTerrace() {
    return terrace;
  }

  /**
   * Set terrace value.
   *
   * @param terrace terrace value
   */
  public void setTerrace(String terrace) {
    this.terrace = terrace;
  }
}
