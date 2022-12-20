package designpatterns.creational.prototype;

import java.util.logging.Logger;

/**
 * Doctor class.
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public class Doctor extends Profession {
  public static final Logger LOGGER = Logger.getLogger(Doctor.class.getName());

  @Override
  void print() {
    LOGGER.info("I am a Doctor");
  }
}
