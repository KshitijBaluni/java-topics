package collections;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CoreJavaMapTest {

  private CoreJavaMap<Integer, Integer> coreJavaMap;

  @Before
  public void init() {
    coreJavaMap = new CoreJavaMap<>(new HashMap(Map.of(1, 6, 2, 3)), new TreeMap(
      Map.of(2, 8, 1, 9)), new LinkedHashMap(Map.of(1, 8, 2, 8)));
  }

  @Test
  public void hashMapTest() {
    coreJavaMap.getHashMap().put(1, 8);
    assertEquals(Map.of(1, 8, 2, 3), coreJavaMap.getHashMap());

    coreJavaMap.getHashMap().put(3, 9);
    assertEquals(Map.of(1, 8, 2, 3, 3, 9), coreJavaMap.getHashMap());

    coreJavaMap.getHashMap().remove(1);
    assertEquals(Map.of(2, 3, 3, 9), coreJavaMap.getHashMap());

    assertEquals(Optional.of(3), Optional.of(coreJavaMap.getHashMap().get(2)));
    assertTrue(coreJavaMap.getHashMap().containsValue(3));
  }

  @Test
  public void treeMapTest() {
    coreJavaMap.getTreeMap().put(1, 9);
    assertEquals(Map.of(2, 8, 1, 9), coreJavaMap.getTreeMap());

    coreJavaMap.getTreeMap().putAll(Map.of(1, 9, 8, 9, 6 ,7));
    assertEquals(Map.of(2, 8, 1, 9,8, 9, 6 ,7), coreJavaMap.getTreeMap());

    coreJavaMap.getTreeMap().remove(1, 9);
    assertEquals(Map.of(2, 8,8, 9, 6 ,7), coreJavaMap.getTreeMap());

    assertTrue(coreJavaMap.getTreeMap().containsKey(2));
    assertEquals(Optional.of(7), Optional.of(coreJavaMap.getTreeMap().get(6)));
  }

  @Test
  public void linkedHashMap() {
    coreJavaMap.getLinkedHashMap().putIfAbsent(1, 9);
    assertEquals(Map.of(1, 8, 2, 8), coreJavaMap.getLinkedHashMap());

    coreJavaMap.getLinkedHashMap().putIfAbsent(10, 9);
    assertEquals(Map.of(1, 8, 2, 8, 10, 9), coreJavaMap.getLinkedHashMap());

    coreJavaMap.getLinkedHashMap().putIfAbsent(null, 9);
    assertEquals(Optional.of(9), Optional.of(coreJavaMap.getLinkedHashMap().get(null)));
    LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put(1, 8);
    linkedHashMap.put(2, 8);
    linkedHashMap.put(10, 9);
    linkedHashMap.put(null, 9);
    assertEquals(
      Optional.of(linkedHashMap),
      Optional.of(coreJavaMap.getLinkedHashMap())
    );

    coreJavaMap.getLinkedHashMap().clear();
    assertEquals(Map.of(), coreJavaMap.getLinkedHashMap());
  }
}
