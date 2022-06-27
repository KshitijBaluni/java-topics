import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Samples for Stream API in Java.
 *
 * @author kshitijbaluni
 * @since 27 June 2022
 */
public class CoreJavaStream {

  private void intermediateStreamOperations() {
    //1. map - Sample code to test map intermediate operations
    List<Integer> list = Arrays.asList(2, 4, 3, 5, 3, 4, 2);
    List result = list.stream().map(x -> x * x).collect(Collectors.toList());
    System.out.println("Map result list - " + result);
  }

  public static void main(String[] args) {
    CoreJavaStream coreJavaStream = new CoreJavaStream();
    coreJavaStream.intermediateStreamOperations();
  }
}
