package collections;

import org.junit.Before;

import java.util.Set;

public class CoreJavaSetTest {
  CoreJavaSet<Integer> coreJavaSet;

  @Before
  public void init() {
    coreJavaSet = new CoreJavaSet<>();
    coreJavaSet.setTreeSet(Set.of(1, 2, 3));
    coreJavaSet.setHashSet(Set.of(1, 3, 4, 5));
    coreJavaSet.setLinkedHashSet(Set.of(1, 2, 3, 4));
    coreJavaSet.setSortedSet(Set.of(1, 2, 3, 7, 8));
  }
}
