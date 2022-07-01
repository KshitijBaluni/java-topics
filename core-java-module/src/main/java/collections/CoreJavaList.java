package collections;

import java.util.Arrays;
import java.util.List;

/**
 * Core Java List Demo.
 *
 * @author kshitijbaluni
 * @since 30 June 2022
 */
public class CoreJavaList<T> {
  private List<T> arrayList;
  private List<T> linkedList;
  private List<T> vector;
  private List<T> stack;

  public CoreJavaList(List<T> arrayList, List<T> linkedList, List<T> vector, List<T> stack) {
    this.arrayList = arrayList;
    this.linkedList = linkedList;
    this.vector = vector;
    this.stack = stack;
  }

  public CoreJavaList() {

  }

  public List<T> getArrayList() {
    return arrayList;
  }

  public void setArrayList(List<T> arrayList) {
    this.arrayList = arrayList;
  }

  public List<T> getLinkedList() {
    return linkedList;
  }

  public void setLinkedList(List<T> linkedList) {
    this.linkedList = linkedList;
  }

  public List<T> getVector() {
    return vector;
  }

  public void setVector(List<T> vector) {
    this.vector = vector;
  }

  public List<T> getStack() {
    return stack;
  }

  public void setStack(List<T> stack) {
    this.stack = stack;
  }

  /**
   * Get the List elements.
   *
   * @param list
   * @return list
   */
  public List<T> getList(List<T> list) {
    return list;
  }

  /***
   * Adds the element to the list.
   *
   * @param list
   * @param element
   */
  public void addElementToList(List<T> list, T element) {
    list.add(element);
  }

  /**
   * Add the elements list to the given list.
   *
   * @param list
   * @param addElements
   */
  public void addElementsToList(List<T> list, List<T> addElements) {
    for (T e : addElements) {
      list.add(e);
    }
  }

  /**
   * Remove the element from the list.
   *
   * @param list
   * @param element
   */
  public void removeElementFromList(List<T> list, T element) {
    list.remove(element);
  }

  /***
   * Remove elements from the List.
   *
   * @param list
   * @param removeElements
   */
  public void removeElementsFromList(List<T> list, List<T> removeElements) {
    for (T e : removeElements) {
      list.remove(e);
    }
  }

  /***
   * remove all the elements from the List.
   *
   * @param list
   */
  public void clearList(List<T> list) {
    list.clear();
  }

  public static void main(String[] args) {
    CoreJavaList<Integer> coreJavaList = new CoreJavaList<>();
    coreJavaList.setArrayList(Arrays.asList(1, 2, 3, 4, 7));
    coreJavaList.setLinkedList(Arrays.asList(1, 6, 7, 8));
    coreJavaList.setVector(Arrays.asList(1, 6, 7, 8));
    coreJavaList.setStack(Arrays.asList(1, 6, 7, 7, 9));

    //Print Integer Lists
    System.out.println("Array List:" + coreJavaList.getArrayList());
    System.out.println("Linked List:" + coreJavaList.getLinkedList());
    System.out.println("Vector List:" + coreJavaList.getVector());
    System.out.println("Stack List:" + coreJavaList.getStack());


    CoreJavaList<String> coreJavaStringList = new CoreJavaList<>();
    coreJavaStringList.setArrayList(Arrays.asList("1", "2", "3", "4", "7"));
    coreJavaStringList.setLinkedList(Arrays.asList("1", "6", "7", "8"));
    coreJavaStringList.setVector(Arrays.asList("1", "6", "7", "8"));
    coreJavaStringList.setStack(Arrays.asList("1", "6", "7", "7", "9"));

    //Print String Lists
    System.out.println("Array String List:" + coreJavaStringList.getArrayList());
    System.out.println("Linked String List:" + coreJavaStringList.getLinkedList());
    System.out.println("Vector String List:" + coreJavaStringList.getVector());
    System.out.println("Stack String List:" + coreJavaStringList.getStack());



  }
}
