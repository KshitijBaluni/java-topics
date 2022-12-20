package designpatterns.creational.prototype;

/**
 * Demo for Prototype cloning Design Pattern.
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public class CoreJavaPrototype {
  private Profession profession;

  /**
   * Constructor for CoreJavaPrototype.
   *
   * @return profession.
   */
  public Profession getProfession() {
    return profession;
  }

  /**
   * Set the profession.
   *
   * @param profession profession
   */
  public void setProfession(Profession profession) {
    this.profession = profession;
  }

  /**
   * Get the profession.
   *
   * @param profession profession
   */
  public CoreJavaPrototype(Profession profession) {
    this.profession = profession;
  }
}
