package com.gitHub.automation.steps;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import cucumber.api.java.en.*;
import org.json.JSONArray;
import org.junit.Assert;

public class BooksAPIStepDef {

    public static Response last_response;
    RestAssured client = new RestAssured();

    @When("^Send the API call GET ([^\"]*) with query parameters$")
    public void iSendTheAPICallGETHttpsBooksJsonWithQueryParameters(String url, String queryParameters) throws Throwable {

        System.out.println("\n[Service Request-URL]: " + url + queryParameters);

        last_response = client.given()
                .header("Content-Type", "application/json")
                .get(url + queryParameters)
                .then()
                .extract()
                .response();

        System.out.println("\n[Service Response-Body]: " + last_response.asString());
        System.out.println("\n[Service Status Code]: " + last_response.getStatusCode());
        System.out.println("\n[Service Status Line]: " + last_response.getStatusLine());
        }


    @Then("^Should received success response with status code 200.$")
    public void IShouldReceivedResponseWithStatusCode() {
        Assert.assertEquals(last_response.getStatusCode(), 200);
    }


}
