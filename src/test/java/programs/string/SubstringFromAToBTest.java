package programs.string;

import org.junit.Test;
import programs.String.SubStringFromAToB;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SubstringFromAToBTest {
    @Test
    public void dropStringTest(){
        SubStringFromAToB substringFromAToB=new SubStringFromAToB();
        String output=substringFromAToB.dropString("hamburger",4,8);
        assertEquals("urge",output);
    }

    @Test
    public void dropStringArrTest(){
        SubStringFromAToB substringFromAToB=new SubStringFromAToB();
        String output=substringFromAToB.dropStringArr("hamburger",4,8);
        assertEquals("urge",output);
    }
}