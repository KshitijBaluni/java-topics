package collections.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HashMapReplaceTest {
    @Test
    public void hashmapKeyReplace() {
        HashMapReplace hashMapReplace=new HashMapReplace();
        HashMap<String, Integer> map=new HashMap<>();
        map.put("India",91);
        map.put("USA",1);
        map.put("Pakistan",92);
        map.put("England",43);
        HashMap<String, Integer> hmap = hashMapReplace.hashmapKeyReplace(map, "USA", "Russia", 81);
        assertEquals(Map.of("Pakistan", 92,"England", 43,"India",91,"Russia",81), hmap);
    }
}