package serialization;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Serialization Demo class.
 *
 * @author kshitijbaluni
 * @since 22 July 2022
 */
@Setter
@Getter
@Builder
public class CoreJavaSerialization implements Serializable {
  private int id;
  private String name;
}
