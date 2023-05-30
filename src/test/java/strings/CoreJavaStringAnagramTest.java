package strings;

import org.junit.Assert;
import org.junit.Test;

public class CoreJavaStringAnagramTest {

    @Test
    public void testStringsAreAnagramOrNot() {
        Assert.assertTrue(CoreJavaStringsAnagram.isAnagram("anagram", "margana"));
        Assert.assertTrue(CoreJavaStringsAnagram.isAnagram("Hello", "hello"));
        Assert.assertTrue(CoreJavaStringsAnagram.isAnagram("CAT", "ACT"));
        Assert.assertFalse(CoreJavaStringsAnagram.isAnagram("CAT", "AC"));
    }
}
