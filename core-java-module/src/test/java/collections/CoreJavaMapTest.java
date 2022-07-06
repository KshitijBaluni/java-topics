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
      Map.of(1, 4, 2, 8)), new LinkedHashMap(Map.of(1, 8, 2, 8)));
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


}
