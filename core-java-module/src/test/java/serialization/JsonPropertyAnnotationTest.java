package serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

public class JsonPropertyAnnotationTest {
  public static final Logger logger = Logger.getLogger(JsonPropertyAnnotationTest.class.getName());
  private JsonPropertyAnnotation jsonPropertyAnnotation;

  @Before
  public void init() {
    jsonPropertyAnnotation = new JsonPropertyAnnotation(new ObjectMapper(), new Gson());
  }

  @Test
  public void testJsonPropertyJacksonTest() throws JsonProcessingException {
    User user = new User("Sai", "Adithya", "9959984000", "0402358700");
    String data = jsonPropertyAnnotation.getObjectMapper().enable(SerializationFeature.INDENT_OUTPUT).writeValueAsString(user);
    logger.info(data);
    Assert.assertFalse(data.isEmpty());

    Assert.assertTrue(data.contains("last-name"));
    Assert.assertTrue(data.contains("firstName"));
    Assert.assertTrue(data.contains("mobile-phone"));
    Assert.assertTrue(data.contains("home_phone"));
  }

  /**
   * Using Gson we use @SerializeName annotation.
   */
  @Test
  public void testSerializationTest() {
    User user = new User("Sai", "Adithya", "9959984000", "0402358700");
    String gsonData = jsonPropertyAnnotation.getGsonObject().toJson(user);
    logger.info(gsonData);
    Assert.assertFalse(gsonData.isEmpty());

    JsonObject jsonObject = JsonParser.parseString(gsonData).getAsJsonObject();
    Assert.assertEquals(user.getFirstName(), jsonObject.get("first-name").getAsString());
    Assert.assertEquals(user.getLastName(), jsonObject.get("lastName").getAsString());
    Assert.assertEquals(user.getMobilePhone(), jsonObject.get("mobilePhone").getAsString());
    Assert.assertEquals(user.getWorkPhone(), jsonObject.get("workPhone").getAsString());
  }
}
