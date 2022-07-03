package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/***
 * Core Java Set Demo
 *
 * @author kshitijbaluni
 * @since 03 July 2022
 */
public class CoreJavaSet<T> {
  private TreeSet<T> treeSet;
  private HashSet<T> hashSet;
  private LinkedHashSet<T> linkedHashSet;
  private SortedSet<T> sortedSet;

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
   * @param sortedSet
   */
  public CoreJavaSet(TreeSet<T> treeSet, HashSet<T> hashSet, LinkedHashSet<T> linkedHashSet,
                     SortedSet<T> sortedSet) {
    this.treeSet = treeSet;
    this.hashSet = hashSet;
    this.linkedHashSet = linkedHashSet;
    this.sortedSet = sortedSet;
  }

  public TreeSet<T> getTreeSet() {
    return treeSet;
  }

  public void setTreeSet(TreeSet<T> treeSet) {
    this.treeSet = treeSet;
  }

  public HashSet<T> getHashSet() {
    return hashSet;
  }

  public void setHashSet(HashSet<T> hashSet) {
    this.hashSet = hashSet;
  }

  public LinkedHashSet<T> getLinkedHashSet() {
    return linkedHashSet;
  }

  public void setLinkedHashSet(LinkedHashSet<T> linkedHashSet) {
    this.linkedHashSet = linkedHashSet;
  }

  public SortedSet<T> getSortedSet() {
    return sortedSet;
  }

  public void setSortedSet(SortedSet<T> sortedSet) {
    this.sortedSet = sortedSet;
  }
}
