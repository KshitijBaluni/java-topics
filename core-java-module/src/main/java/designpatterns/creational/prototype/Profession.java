package designpatterns.creational.prototype;

/**
 * Profession Abstract class that is Cloneable.
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public abstract class Profession implements Cloneable {
  private int id;
  private String name;

  abstract void print();

  /**
   * Get profession id.
   *
   * @return profession id
   */
  public int getId() {
    return id;
  }

  /**
   * Set profession id.
   *
   * @param id profession id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Get profession name.
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Set Profession name.
   *
   * @param name profession name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Cloning method for profession.
   *
   * @return cloned object.
   */
  public Object cloningMethod() {
    Object clone = null;

    try {
      clone = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return clone;
  }
}
