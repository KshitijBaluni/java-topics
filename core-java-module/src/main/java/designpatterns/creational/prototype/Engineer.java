package designpatterns.creational.prototype;

import java.util.logging.Logger;

/**
 * Engineer class.
 *
 * @author kshitijbaluni
 * @since 14 July 2022
 */
public class Engineer extends Profession {
  public static final Logger LOGGER = Logger.getLogger(Engineer.class.getName());

  @Override
  void print() {
    LOGGER.info("I am a Engineer");
  }
}
