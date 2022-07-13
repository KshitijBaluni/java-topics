package designpatterns.creational.abstractfactory;

/***
 * Teacher Concrete class.
 *
 * @author kshitijbaluni
 * @since 13 July 2022
 */
public class Teacher implements Profession {
  @Override
  public void print() {
    System.out.println("I am a Teacher");
  }
}
