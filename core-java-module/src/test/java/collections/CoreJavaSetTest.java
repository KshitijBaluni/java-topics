package collections;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CoreJavaSetTest {
  CoreJavaSet<Integer> coreJavaSet;

  @Before
  public void init() {
    coreJavaSet = new CoreJavaSet<>();
    coreJavaSet.setTreeSet(new TreeSet<>(Set.of(1, 2, 3)));
    coreJavaSet.setHashSet(new HashSet<>(Set.of(1, 3, 4, 5)));
    coreJavaSet.setLinkedHashSet(new LinkedHashSet<>(Set.of(1, 2, 3, 4)));
  }

  @Test
  public void addElementToTheSetTest() {
    coreJavaSet.getTreeSet().add(1);
    assertEquals(Set.of(1, 2, 3), coreJavaSet.getTreeSet());

    coreJavaSet.getTreeSet().addAll(Set.of(5, 2, 4, 7, 9));
    assertEquals(Set.of(1, 2, 3, 4, 5, 7, 9), coreJavaSet.getTreeSet());

    coreJavaSet.getTreeSet().remove(1);
    assertEquals(Set.of(2, 3, 4, 5, 7, 9), coreJavaSet.getTreeSet());

    coreJavaSet.getTreeSet().removeAll(Set.of(1, 2, 3, 4));
    assertEquals(Set.of(5, 7, 9), coreJavaSet.getTreeSet());

    assertTrue(coreJavaSet.getTreeSet().contains(7));
    assertTrue(coreJavaSet.getTreeSet().containsAll(Set.of(5, 7, 9)));
  }
}
