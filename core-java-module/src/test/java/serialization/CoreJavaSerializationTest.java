package serialization;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CoreJavaSerializationTest {
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

      System.out.println("Core Java Serialization object is serialized");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      FileInputStream fileInputStream = new FileInputStream(filename);
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

      CoreJavaSerialization deSerializedObject = (CoreJavaSerialization) objectInputStream.readObject();
      Assert.assertEquals(2, deSerializedObject.getId());
      Assert.assertEquals("John Doe", deSerializedObject.getName());

      fileInputStream.close();
      objectInputStream.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
