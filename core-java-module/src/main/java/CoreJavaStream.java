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

  /**
   * collect - The collect method is used to return the result of the intermediate operations performed on the stream.
   *
   * @param list
   * @return result List
   */
  private List collectStreamTerminateOperation(List<Integer> list) {
    return list.parallelStream().map(x-> x*2).collect(Collectors.toList());
  }

  /**
   * forEach - The forEach method is used to iterate through every element of the stream.
   * @param list
   */
  private void forEachStreamTerminateOperation(List<Integer> list) {
    list.stream().forEach(x -> System.out.print(String.format(" %s",x)));
  }

  /**
   * reduce -The reduce method is used to reduce the elements of a stream to a single value.
   * The reduce method takes a BinaryOperator as a parameter.
   *
   * @param list
   * @return
   */
  private int reduceStreamTerminateOperation(List<Integer> list) {
    return list.stream().limit(3).reduce(0, (ans, i) -> ans + i);
  }


  public static void main(String[] args) {
    CoreJavaStream coreJavaStream = new CoreJavaStream();
    List<Integer> list = Arrays.asList(2, 4, 3, 5, 3, 4, 2);
    List result = null;

    result = coreJavaStream.mapStreamIntermediateOperations(list);
    System.out.println("\nMap IO stream: " + result);

    result = coreJavaStream.filterStreamIntermediateOperations(list);
    System.out.println("\nFilter IO stream: " + result);

    result = coreJavaStream.sortedStreamIntermediateOperations(list);
    System.out.println("\nSorted IO stream: " + result);

    result = coreJavaStream.collectStreamTerminateOperation(list);
    System.out.println("\nCollect TO stream: " + result);

    System.out.print("\nForEach TO stream: ");
    coreJavaStream.forEachStreamTerminateOperation(list);

    int output = coreJavaStream.reduceStreamTerminateOperation(list);
    System.out.println("\n\nReduce TO stream: " + output);
  }
}
