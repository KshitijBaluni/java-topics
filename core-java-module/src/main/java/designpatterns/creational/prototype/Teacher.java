package designpatterns.creational.prototype;

import java.util.logging.Logger;

/**
 * Teacher class.
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public class Teacher extends Profession {
  public static final Logger LOGGER = Logger.getLogger(Teacher.class.getName());

  @Override
  void print() {
    LOGGER.info("I am a Teacher");
  }
}
