package collections.set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Set Functions
 *
 * @author Ankit Rawat
 * @since 27 Dec 2022
 */
public class AddRemoveFunctionInSet {

    /**
     * Add all elements in hashSet
     *
     * @param asList-arraylist of elements to be added
     * @return hash_set- hashset with all added elements
     */
    public  Set<String> addSet(List asList) {
        Set<String> hash_set = new HashSet<String>();
        hash_set.addAll(asList);
        return hash_set;
    }

    /**
     * Remove an elements in hashSet
     *
     * @param asList-arraylist of elements to be added
     * @param s-element to be removed from hashset
     * @return hash_set- hashset with removed element
     */
    public  Set<String> removeSet(List asList, String s) {
        Set<String> hash_set = new HashSet<String>();
        hash_set.addAll(asList);
        hash_set.remove(s);
        return hash_set;
    }

    /**
     * Add all elements in hashSet using iterator
     *
     * @param asList-arraylist of elements to be added
     * @return hash_set- hashset with all added elements
     */
    public  Set<String> addUsingIterator(List asList) {
        Set<String> hash_set = new HashSet<String>();
        Iterator<String> i=asList.iterator();
        while (i.hasNext()) {
            hash_set.add(i.next());
        }
        return hash_set;
    }

    /**
     * To check if an element is present in a hashset or not
     *
     * @param asList-arraylist of elements to be added
     * @param s- element to be searched
     * @return present-true or false
     */
    public  Boolean containsSet(List asList, String s) {
        Set<String> hash_set = new HashSet<String>();
        hash_set.addAll(asList);
        Boolean present=hash_set.contains(s);
        return present;
    }
}