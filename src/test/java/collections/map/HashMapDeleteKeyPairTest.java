package collections.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HashMapDeleteKeyPairTest {
    @Test
    public void hashmapKeyDel(){
        HashMapDeleteKeyPair hashmapDeleteKeyPair=new HashMapDeleteKeyPair();
        HashMap<String, Integer> map=new HashMap<>();
        map.put("India",91);
        map.put("USA",1);
        map.put("Pakistan",92);
        map.put("England",43);
        HashMap<String, Integer> hmap = hashmapDeleteKeyPair.hashmapKeyDel(map, "USA");
        assertEquals(Map.of("Pakistan", 92,"England", 43,"India",91), hmap);
    }
}