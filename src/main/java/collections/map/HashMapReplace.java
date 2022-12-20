package collections.map;

import java.util.HashMap;
/**
 * HashMap to replace value
 *
 * @author Ankit Rawat
 * @since 20 Dec 2022
 */
public class HashMapReplace {

    /**
     * Replace a key value from hashmap
     *
     * @param hmap
     * @param s key which is to be replaced
     * @param n new key to put
     * @param code new value to put in corresponding to n key
     * @return hmap.get(winner) return value of key having winner param
     */
    public HashMap<String, Integer> hashmapKeyReplace(HashMap<String, Integer> hmap, String s, String n, int code) {

        for (String country : hmap.keySet()) {
            System.out.println("iterate" + country);
            if (country == s)
                hmap.remove(country);
            hmap.put(n, code);
            break;
        }
        return hmap;
    }
}