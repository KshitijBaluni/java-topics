package designpatterns.creational.abstractfactory;

/***
 * Abstract Factory Producer give underline base Factories.
 *
 * @author kshitijbaluni
 * @since 13 July, 2022
 */
public class AbstractFactoryProducer {
  /***
   * Get the Abstract Factory objects.
   *
   * @param isTrainee define trainee
   * @return Abstract factory object
   */
  public static AbstractFactory getProfession(boolean isTrainee) {
    if (isTrainee)
      return new TraineeProfessionAbstractFactory();
    else
      return new ProfessionAbstractFactory();
  }
}
