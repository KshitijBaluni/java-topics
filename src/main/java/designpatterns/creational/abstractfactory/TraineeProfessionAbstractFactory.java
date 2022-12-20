package designpatterns.creational.abstractfactory;

/***
 * Trainee Profession Abstract Factory class.
 *
 * @author kshitijbaluni
 * @since 13 July 2022
 */
public class TraineeProfessionAbstractFactory extends AbstractFactory {
  @Override
  public Profession getProfession(AbstractFactory.ProfessionTypes typeOfProfession) {
    if (typeOfProfession.equals(AbstractFactory.ProfessionTypes.TRAINEE_ENGINEER))
      return new TraineeEngineer();
    else if (typeOfProfession.equals(AbstractFactory.ProfessionTypes.TRAINEE_TEACHER))
      return new TraineeTeacher();
    return null;
  }
}
