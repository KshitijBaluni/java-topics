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

  /**
   * map - Sample code to test map intermediate operations.
   *
   * @param list
   * @return result List
   */
  private List mapStreamIntermediateOperations(List<Integer> list) {
    return list.stream().map(x -> x * x).collect(Collectors.toList());
  }

  /**
   * filter - intermediate operations stream based on the predicate(functional interface/filter condition).
   *
   * @param list
   * @return result List
   */
  private List filterStreamIntermediateOperations(List<Integer> list) {
    return list.stream().filter(x -> (x % 2 == 0)).collect(Collectors.toList());
  }

  /**
   * sorted - The sorted method is used to sort the stream.
   *
   * @param list
   * @return result List
   */
  private List sortedStreamIntermediateOperations(List<Integer> list) {
    return list.stream().sorted().collect(Collectors.toList());
  }

  public static void main(String[] args) {
    CoreJavaStream coreJavaStream = new CoreJavaStream();
    List<Integer> list = Arrays.asList(2, 4, 3, 5, 3, 4, 2);
    List result = null;

    result = coreJavaStream.mapStreamIntermediateOperations(list);
    System.out.println("Map IO stream :" + result);

    result = coreJavaStream.filterStreamIntermediateOperations(list);
    System.out.println("Filter IO stream :" + result);

    result = coreJavaStream.sortedStreamIntermediateOperations(list);
    System.out.println("Sorted IO stream:" + result);
  }
}
