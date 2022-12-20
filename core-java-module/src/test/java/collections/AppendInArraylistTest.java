package collections;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppendInArraylistTest {
    int x=44;
    @Test
    public void arrayFind() {
        AppendInArraylist appendInArraylist=new AppendInArraylist();
        int appendedValue=appendInArraylist.arrayFind(x);
        assertEquals(x,appendedValue);


            }
}
