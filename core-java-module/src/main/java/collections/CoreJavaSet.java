package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/***
 * Core Java Set Demo
 *
 * @author kshitijbaluni
 * @since 03 July 2022
 */
public class CoreJavaSet<T> {
  private Set<T> treeSet;
  private Set<T> hashSet;
  private Set<T> linkedHashSet;

  /***
   * Default Constructor.
   *
   */
  public CoreJavaSet() {
  }

  /***
   * Parameterized Constructor.
   *
   * @param treeSet
   * @param hashSet
   * @param linkedHashSet
   */
  public CoreJavaSet(TreeSet<T> treeSet, HashSet<T> hashSet, LinkedHashSet<T> linkedHashSet) {
    this.treeSet = treeSet;
    this.hashSet = hashSet;
    this.linkedHashSet = linkedHashSet;
  }

  public Set<T> getTreeSet() {
    return treeSet;
  }

  public void setTreeSet(Set<T> treeSet) {
    this.treeSet = treeSet;
  }

  public Set<T> getHashSet() {
    return hashSet;
  }

  public void setHashSet(Set<T> hashSet) {
    this.hashSet = hashSet;
  }

  public Set<T> getLinkedHashSet() {
    return linkedHashSet;
  }

  public void setLinkedHashSet(Set<T> linkedHashSet) {
    this.linkedHashSet = linkedHashSet;
  }
}
