package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

public class LoginTest extends ApiUtils {

    private Response response;

    @Given("I set the base URI")
    public void i_set_the_base_uri() {
        ApiUtils.setBaseURI("http://64.227.160.186:8080");

    }

    @When("I perform login with {string} and {string}")
    public void i_perform_login_with_credentials(String username, String password) {
        response = ApiUtils.login(username, password);

    }

    @Then("I should get a {int}")
    public void i_should_get_a_status_code(Integer statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode.intValue(), "Status code mismatch");
    }
}
