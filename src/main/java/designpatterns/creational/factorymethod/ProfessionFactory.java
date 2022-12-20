package designpatterns.creational.factorymethod;

/***
 * Profession Factory class.
 *
 * @author kshitijbaluni
 * @since 13 July 2022
 */
public class ProfessionFactory {

  public enum ProfessionTypes {DOCTOR, ENGINEER, TEACHER}

  /**
   * Get the profession object based on the profession type.
   *
   * @param professionType profession type
   * @return profession object
   */
  public static Profession getProfession(ProfessionTypes professionType) {
    if(professionType != null) {
      if (professionType.equals(ProfessionTypes.DOCTOR))
        return new Doctor();
      else if (professionType.equals(ProfessionTypes.ENGINEER))
        return new Engineer();
      else if (professionType.equals(ProfessionTypes.TEACHER))
        return new Teacher();
    }
    return null;
  }
}
