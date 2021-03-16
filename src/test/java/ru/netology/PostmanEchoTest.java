package ru.netology;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldReturnTestData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Some info"));
    }
}
