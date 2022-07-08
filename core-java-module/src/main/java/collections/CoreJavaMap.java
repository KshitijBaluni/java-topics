package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Core Java Map Demo.
 *
 * @author kshitijbaluni
 * @since July 06 2022
 */
public class CoreJavaMap<T, K> {
  private Map<T, K> hashMap;
  private Map<T, K> treeMap;
  private Map<T, K> linkedHashMap;

  /**
   * Default Constructor
   */
  public CoreJavaMap() {
  }

  /**
   * Parameterized Constructor.
   *
   * @param hashMap
   * @param treeMap
   * @param linkedHashMap
   */
  public CoreJavaMap(Map<T, K> hashMap, Map<T, K> treeMap, Map<T, K> linkedHashMap) {
    this.hashMap = hashMap;
    this.treeMap = treeMap;
    this.linkedHashMap = linkedHashMap;
  }

  /**
   * Return Hash Map.
   *
   * @return hashMap
   */
  public Map<T, K> getHashMap() {
    return hashMap;
  }

  /**
   * Set Hash Map.
   *
   * @param hashMap
   */
  public void setHashMap(Map<T, K> hashMap) {
    this.hashMap = (hashMap instanceof HashMap) ? hashMap : Collections.EMPTY_MAP;
  }

  /**
   * Get Tree Map.
   *
   * @return
   */
  public Map<T, K> getTreeMap() {
    return treeMap;
  }

  /**
   * Set Tree Map
   *
   * @param treeMap
   */
  public void setTreeMap(Map<T, K> treeMap) {
    this.treeMap = treeMap instanceof TreeMap ? treeMap : Collections.EMPTY_MAP;
  }

  /**
   * Get LinkedHashMap
   *
   * @return
   */
  public Map<T, K> getLinkedHashMap() {
    return linkedHashMap;
  }

  /**
   * Set Linked Hashmap.
   *
   * @param linkedHashMap
   */
  public void setLinkedHashMap(Map<T, K> linkedHashMap) {
    this.linkedHashMap = linkedHashMap instanceof LinkedHashMap ? linkedHashMap : Collections.EMPTY_MAP;
  }
}
