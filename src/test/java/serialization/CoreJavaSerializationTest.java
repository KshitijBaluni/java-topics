package serialization;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CoreJavaSerializationTest {
    private final static Logger logger = Logger.getLogger(CoreJavaSerializationTest.class.getName());
    private CoreJavaSerialization coreJavaSerialization;

    @Before
    public void init() {
        coreJavaSerialization = CoreJavaSerialization.builder().id(2).name("John Doe").build();
    }

    @Test
    public void testSerialization() {

        Assert.assertEquals(2, coreJavaSerialization.getId());
        Assert.assertEquals("John Doe", coreJavaSerialization.getName());

        coreJavaSerialization.setId(1);
        coreJavaSerialization.setName("Rammy Sam");

        Assert.assertEquals(1, coreJavaSerialization.getId());
        Assert.assertEquals("Rammy Sam", coreJavaSerialization.getName());
    }

    @Test
    public void testSerializeObject() {
        String filename = "file.ser";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(coreJavaSerialization);
            fileOutputStream.close();
            objectOutputStream.close();

            logger.info("Core Java Serialization object is serialized");
        } catch (IOException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            CoreJavaSerialization deSerializedObject = (CoreJavaSerialization) objectInputStream.readObject();
            Assert.assertEquals(2, deSerializedObject.getId());
            Assert.assertEquals("John Doe", deSerializedObject.getName());

            fileInputStream.close();
            objectInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }

        CoreJavaSerialization.CoreJavaSerializationBuilder coreJavaSerializationBuilder = CoreJavaSerialization.builder();
        CoreJavaSerialization testObject = coreJavaSerializationBuilder.build();
        String coreJavaSerializationBuilderString = CoreJavaSerialization.builder().id(4).name("ToString").toString();
        logger.info(coreJavaSerializationBuilderString);
    }
}
