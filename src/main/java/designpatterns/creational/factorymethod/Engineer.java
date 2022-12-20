package designpatterns.creational.factorymethod;

/***
 * Engineer Concrete class.
 *
 * @author kshitijbaluni
 * @since 13 July 2022
 */
public class Engineer implements Profession {
  @Override
  public void print() {
    System.out.println("I am a Engineer");
  }
}
