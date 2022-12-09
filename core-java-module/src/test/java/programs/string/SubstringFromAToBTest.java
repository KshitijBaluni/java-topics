package programs.string;

import org.junit.Test;
import programs.String.SubstringFromAToB;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SubstringFromAToBTest {
    @Test
    public void dropStringTest(){
        SubstringFromAToB substringFromAToB=new SubstringFromAToB();
        String output=substringFromAToB.dropString("hamburger",4,8);
        assertEquals("urge",output);
    }

    @Test
    public void dropStringArrTest(){
        SubstringFromAToB substringFromAToB=new SubstringFromAToB();
        String output=substringFromAToB.dropstringArr("hamburger",4,8);
        assertEquals("urge",output);
    }
}
