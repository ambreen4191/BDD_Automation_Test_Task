package StepDefinations;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.cucumber.java.en.*;

public class GetUserSteps {

    private String baseURI;
    private String endpoint;
    private Response response;

    @Step("Set the get user service endpoint")
    @Given("I have set get single user service endpoint")
    public void iHaveSetGetSingleUserServiceEndpoint() {
        baseURI = "https://reqres.in/api"; // Replace with actual base URL
        endpoint = "/users/2";
        RestAssured.baseURI = baseURI;
        Allure.addAttachment("Base URI", baseURI);
        Allure.addAttachment("Endpoint", endpoint);
    }

    @Step("Send the GET request")
    @When("I send the GET API request")
    public void iSendTheApiRequest() {
        response = RestAssured.given()
                .header("Content-Type", "application/json")
                .get(endpoint);

        Allure.addAttachment("Response", response.asString());
    }

    @Step("Validate the status code")
    @Then("I should receive an expected API response status code")
    public void iShouldReceiveAnExpectedAPIResponseStatusCode() {
        Assert.assertEquals(200, response.getStatusCode());
        Allure.addAttachment("Status Code", String.valueOf(response.getStatusCode()));
    }

    @Step("Validate the user details")
    @And("receive the expected user details")
    public void receiveTheExpectedUserDetails() {
        Assert.assertTrue(response.asString().contains("Janet"));
        Assert.assertTrue(response.asString().contains("Weaver"));

        Allure.addAttachment("User Details", response.asString());
    }
}