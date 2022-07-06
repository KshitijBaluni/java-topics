package collections;

import java.util.Map;

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

  public Map<T, K> getHashMap() {
    return hashMap;
  }

  public void setHashMap(Map<T, K> hashMap) {
    this.hashMap = hashMap;
  }

  public Map<T, K> getTreeMap() {
    return treeMap;
  }

  public void setTreeMap(Map<T, K> treeMap) {
    this.treeMap = treeMap;
  }

  public Map<T, K> getLinkedHashMap() {
    return linkedHashMap;
  }

  public void setLinkedHashMap(Map<T, K> linkedHashMap) {
    this.linkedHashMap = linkedHashMap;
  }
}
