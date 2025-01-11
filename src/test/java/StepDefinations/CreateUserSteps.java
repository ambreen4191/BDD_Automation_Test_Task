package StepDefinations;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.cucumber.java.en.*;

import java.util.HashMap;
import java.util.Map;

public class CreateUserSteps {

    private String baseURI;
    private String endpoint;
    private Map<String, String> payload;
    private Response response;

    @Step("Set the create user service endpoint")
    @Given("I have set create single user service endpoint")
    public void iHaveSetCreateSingleUserServiceEndpoint() {
        baseURI = "https://reqres.in/api"; // Replace with actual base URL
        endpoint = "/users";
        RestAssured.baseURI = baseURI;
        Allure.addAttachment("Base URI", baseURI);
        Allure.addAttachment("Endpoint", endpoint);
    }

    @Step("Set the payload for the user creation request")
    @And("set its payload")
    public void setItsPayload() {
        payload = new HashMap<>();
        payload.put("name", "morpheus");
        payload.put("job", "leader");

        Allure.addAttachment("Payload", payload.toString());
    }

    @Step("Send the POST request")
    @When("I send the POST API request")
    public void iSendTheApiRequest() {
        response = RestAssured.given()
                .header("Content-Type", "application/json")
                .post(endpoint);

        Allure.addAttachment("Response", response.asString());
    }

    @Step("Validate the response contains the created user")
    @Then("I should see the user I created in API response")
    public void iShouldSeeTheUserICreatedInAPIResponse() {
        Assert.assertEquals(201, response.getStatusCode());
        Assert.assertTrue(response.asString().contains("morpheus"));
        Assert.assertTrue(response.asString().contains("leader"));

        Allure.addAttachment("Created User Response", response.asString());
    }
}