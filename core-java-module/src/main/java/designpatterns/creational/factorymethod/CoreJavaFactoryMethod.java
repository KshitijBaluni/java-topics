package designpatterns.creational.factorymethod;

import java.util.List;

/***
 * Demo for Factory Method Design Pattern
 *
 * @author kshitijbaluni
 * @since 13 July 2022
 */
public class CoreJavaFactoryMethod {
  private List<Profession> professionList;

  /**
   * Initializing Constructor.
   *
   * @param professionList list of profession.
   */
  public CoreJavaFactoryMethod(List<Profession> professionList) {
    this.professionList = professionList;
  }

  /**
   * Get Profession List.
   *
   * @return professionList
   */
  public List<Profession> getProfessionList() {
    professionList.add(ProfessionFactory.getProfession(ProfessionFactory.ProfessionTypes.DOCTOR));
    professionList.add(ProfessionFactory.getProfession(ProfessionFactory.ProfessionTypes.ENGINEER));
    professionList.add(ProfessionFactory.getProfession(ProfessionFactory.ProfessionTypes.TEACHER));
    return professionList;
  }
}
