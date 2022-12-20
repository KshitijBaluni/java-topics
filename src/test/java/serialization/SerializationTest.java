package serialization;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SerializationTest {
    private Serialization serialization;

    @Before
    public void init() {
        serialization = Serialization.builder().id(2).name("Serial").build();
    }

    @Test
    public void testSerialization() {
        Assert.assertEquals("Serial", serialization.getName());
        Assert.assertEquals(2, serialization.getId());
    }
}
