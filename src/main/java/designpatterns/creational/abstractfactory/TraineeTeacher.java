package designpatterns.creational.abstractfactory;

/***
 * Trainee Teacher Concrete class.
 *
 * @author kshitijbaluni
 * @since 13 July 2022
 */
public class TraineeTeacher implements Profession {
  @Override
  public void print() {
    System.out.println("I am a Trainee Teacher");
  }
}
