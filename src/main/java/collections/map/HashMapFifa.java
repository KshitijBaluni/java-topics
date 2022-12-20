package collections.map;

import java.util.HashMap;
/**
 * HashMap to return value
 *
 * @author Ankit Rawat
 * @since 20 Dec 2022
 */
public class HashMapFifa {

    /**
     * Remove a key value from hashmap
     *
     * @param hmap
     * @param winner key for which value to return
     * @return hmap.get(winner) return value of key having winner param
     */
    public String winnerFifa(HashMap<Integer, String> hmap, Integer winner) {
        return hmap.get(winner);
    }

    /**
     * Remove a key value from hashmap
     *
     * @param hmap
     * @param runnerUp key for which value to return
     * @return hmap.get(runnerUp) return value of key having runnerUp param
     */
    public String runnerUpFifa(HashMap<Integer, String> hmap, Integer runnerUp) {
        return hmap.get(runnerUp);
    }
}