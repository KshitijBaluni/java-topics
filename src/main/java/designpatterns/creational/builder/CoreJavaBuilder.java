package designpatterns.creational.builder;

/**
 * Demo for Builder Design Pattern.
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public class CoreJavaBuilder {
  private Director director;

  /**
   * CoreJavaBuilder Constructor
   *
   * @return Director object
   */
  public CoreJavaBuilder(Director director) {
    this.director = director;
  }

  /**
   * Get Director.
   * @return Director object
   */
  public Director getDirector() {
    return director;
  }

  /**
   * Set Director.
   *
   * @param director director object
   */
  public void setDirector(Director director) {
    this.director = director;
  }
}
