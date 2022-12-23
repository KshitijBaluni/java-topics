package collections.map;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class HashMapFifaTest {
    @Test
    public void winnerFifa(){
        HashMapFifa hashMapFifa=new HashMapFifa();
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"Argentina");
        map.put(2,"USA");
        map.put(3,"India");
        map.put(4,"France");
        String winnerNation=hashMapFifa.winnerFifa(map,1);
        assertEquals("Argentina",winnerNation);
        assertNotEquals("USA", winnerNation);

    }
    @Test
    public void runnerUp(){
        HashMapFifa hashMapFifa=new HashMapFifa();
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"Argentina");
        map.put(2,"USA");
        map.put(3,"India");
        map.put(4,"France");
        String runnerUpNation=hashMapFifa.runnerUpFifa(map,2);
        assertEquals("USA",runnerUpNation);
        assertNotEquals("Argentina", runnerUpNation);
    }
}

