package designpatterns.creational.abstractfactory;

/***
  * Trainee Engineer Concrete class.
  *
  * @author kshitijbaluni
  * @since 13 July 2022
  */
public class TraineeEngineer implements Profession  {
  @Override
  public void print() {
    System.out.println("I am a Trainee Engineer.");
  }
}
