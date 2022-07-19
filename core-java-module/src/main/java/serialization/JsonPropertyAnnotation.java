package serialization;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class JsonPropertyAnnotation {
  private ObjectMapper objectMapper;
  private Gson gsonObject;

  public JsonPropertyAnnotation(ObjectMapper objectMapper, Gson gsonObject) {
    this.objectMapper = objectMapper;
    this.gsonObject = gsonObject;
  }

  public ObjectMapper getObjectMapper() {
    return objectMapper;
  }

  public Gson getGsonObject() {
    return gsonObject;
  }
}

class User {
  @SerializedName("first-name")
  public String firstName;
  @JsonProperty("last-name")
  public String lastName;
  @JsonProperty("mobile-phone")
  public String mobilePhone;
  @JsonProperty("home_phone")
  public String workPhone;

  public User(String firstName, String lastName, String mobilePhone, String workPhone) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobilePhone = mobilePhone;
    this.workPhone = workPhone;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getWorkPhone() {
    return workPhone;
  }
}
