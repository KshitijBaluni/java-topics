package collections;

import java.util.Collections;
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
    if (treeSet instanceof TreeSet)
      this.treeSet = treeSet;
    else
      this.treeSet = Collections.emptySet();
  }

  public Set<T> getHashSet() {
    return hashSet;
  }

  public void setHashSet(Set<T> hashSet) {
    if (hashSet instanceof HashSet)
      this.hashSet = hashSet;
    else
      this.hashSet = Collections.emptySet();
  }

  public Set<T> getLinkedHashSet() {
    return linkedHashSet;
  }

  public void setLinkedHashSet(Set<T> linkedHashSet) {

    if (linkedHashSet instanceof LinkedHashSet)
      this.linkedHashSet = linkedHashSet;
    else
      this.linkedHashSet = Collections.emptySet();
  }
}
