package designpatterns.creational.prototype;

import java.util.Hashtable;

public class ProfessionCache {
  private static Hashtable<Integer, Profession> hashtable = new Hashtable<>();

  public static Profession getClonedProfession(int id) {
    Profession professionInstance = hashtable.get(id);
    return (Profession) professionInstance.cloningMethod();
  }

  public static void loadProfessionCache() {
    Doctor doctor = new Doctor();
    doctor.setId(1);
    doctor.setName("Doctor");

    hashtable.put(doctor.getId(), doctor);

    Teacher teacher = new Teacher();
    teacher.setId(2);
    teacher.setName("Teacher");

    hashtable.put(teacher.getId(), teacher);

    Engineer engineer = new Engineer();
    engineer.setId(3);
    teacher.setName("Engineer");

    hashtable.put(engineer.getId(), engineer);
  }
}
