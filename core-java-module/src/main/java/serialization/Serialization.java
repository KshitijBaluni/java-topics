package serialization;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Serialization Demo Class.
 *
 * @author Kshitij Baluni
 * @since 22 July 2022
 */
@Data
@Builder
public class Serialization implements Serializable {
    private int id;
    private String name;
}
