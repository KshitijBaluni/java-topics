package designpatterns.creational.factorymethod;

/***
 * Doctor Concrete class.
 *
 * @author kshitijbaluni
 * @since 13 July 2022
 */
public class Doctor implements Profession {
  @Override
  public void print() {
    System.out.println("I am Doctor");
  }
}
