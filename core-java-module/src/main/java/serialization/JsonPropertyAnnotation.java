package serialization;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * Demo class for Json Property Demonstration.
 *
 * @author kshitijbaluni
 * @since 19 July 2022
 */
public class JsonPropertyAnnotation {
  private ObjectMapper objectMapper;
  private Gson gsonObject;

  /**
   * Constructor for setting Object Mapper and Gson.
   *
   * @param objectMapper object mapper object
   * @param gsonObject gson object
   */
  public JsonPropertyAnnotation(ObjectMapper objectMapper, Gson gsonObject) {
    this.objectMapper = objectMapper;
    this.gsonObject = gsonObject;
  }

  /**
   * Get Object Mapper.
   *
   * @return Object Mapper
   */
  public ObjectMapper getObjectMapper() {
    return objectMapper;
  }

  /**
   * Get Gson object.
   *
   * @return gson object.
   */
  public Gson getGsonObject() {
    return gsonObject;
  }
}

/**
 * DTO User class.
 */
class User {
  @SerializedName("first-name")
  public String firstName;
  @JsonProperty("last-name")
  public String lastName;
  @JsonProperty("mobile-phone")
  public String mobilePhone;
  @JsonProperty("home_phone")
  public String workPhone;

  /**
   * Parameterized constructor.
   *
   * @param firstName first name
   * @param lastName last name
   * @param mobilePhone mobile no
   * @param workPhone work phone
   */
  public User(String firstName, String lastName, String mobilePhone, String workPhone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobilePhone = mobilePhone;
    this.workPhone = workPhone;
  }

  /**
   * Get first name.
   *
   * @return first name string.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Get last name.
   *
   * @return last name string
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Get Mobile Phone.
   *
   * @return mobile phone as string
   */
  public String getMobilePhone() {
    return mobilePhone;
  }

  /**
   * Get Work Phone.
   *
   * @return work phone as string
   */
  public String getWorkPhone() {
    return workPhone;
  }
}
