package designpatterns.creational.abstractfactory;

/***
 * Profession Abstract Factory class.
 *
 * @author kshitijbaluni
 * @since 13 July 2022
 */
public class ProfessionAbstractFactory extends AbstractFactory {

  @Override
  public Profession getProfession(AbstractFactory.ProfessionTypes typeOfProfession) {
    if (typeOfProfession.equals(AbstractFactory.ProfessionTypes.ENGINEER)) {
      return new Engineer();
    } else if (typeOfProfession.equals(AbstractFactory.ProfessionTypes.TEACHER)) {
      return new Teacher();
    }
    return null;
  }
}
