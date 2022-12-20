package collections.map;

import java.util.HashMap;
/**
 * HashMap key value delete.
 *
 * @author Ankit Rawat
 * @since 20 Dec 2022
 */
public class HashMapDeleteKeyPair {

    /**
     * Remove a key value from hashmap
     *
     * @param hmap
     * @param s key which is to be removed from the hashmap
     * @return hmap
     */
    public HashMap<String, Integer> hashmapKeyDel(HashMap<String, Integer> hmap, String s) {
        for (String country : hmap.keySet()) {
            if (country.equals(s)) {
                hmap.remove(country);
                return hmap;
            }
        }
        return hmap;
    }
}