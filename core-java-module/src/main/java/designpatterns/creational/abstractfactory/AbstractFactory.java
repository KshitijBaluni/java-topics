package designpatterns.creational.abstractfactory;

/***
 * Abstract Factory Design Pattern.
 *
 * @author kshitijbaluni
 * @since 13 July, 2022
 */
public abstract class AbstractFactory {
  public enum ProfessionTypes {DOCTOR, ENGINEER, TEACHER, TRAINEE_ENGINEER, TRAINEE_TEACHER}

  public abstract Profession getProfession(AbstractFactory.ProfessionTypes typeOfProfession);
}
