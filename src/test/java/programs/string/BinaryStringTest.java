package programs.string;

import org.junit.Test;
import programs.String.BinaryString;

import static org.junit.Assert.assertEquals;

public class BinaryStringTest {

    @Test
    public void binString(){
        BinaryString binaryString=new BinaryString();
        String output =binaryString.binString(1, 2, 2);
        assertEquals("1",output);
    }
}
