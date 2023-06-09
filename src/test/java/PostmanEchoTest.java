import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    public void shouldReturnPost() {
        given()
                .baseUri("https://postman-echo.com")
                .body("response body")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("response body"))
                ;
    }
}
