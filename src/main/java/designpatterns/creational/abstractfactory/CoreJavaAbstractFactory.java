package designpatterns.creational.abstractfactory;

/***
 * Demo for Abstract Factory Design Pattern.
 *
 * @author kshitijbaluni
 * @since 13 July, 2022
 */
public class CoreJavaAbstractFactory {
  private Profession profession;

  /**
   * Get the Profession.
   *
   * @return Profession object
   */
  public Profession getProfession() {
    return this.profession;
  }

  public void setProfession(AbstractFactory.ProfessionTypes profession, boolean isTrainee) {
    this.profession =
      AbstractFactoryProducer.getProfession(isTrainee).getProfession(profession);
  }
}
