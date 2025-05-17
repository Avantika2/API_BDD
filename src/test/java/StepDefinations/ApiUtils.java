package StepDefinations;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiUtils {

    public static void setBaseURI(String uri) {
        RestAssured.baseURI = uri;
    }

    public static Response login(String username, String password) {
        String payload = String.format("{\"username\" : \"%s\", \"password\":\"%s\"}", username, password);

        return RestAssured.given()
                .header("Content-Type", "application/json")
                .body(payload)
                .post("/api/auth/login");
    }
}
