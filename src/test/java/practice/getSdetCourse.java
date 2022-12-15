package practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class getSdetCourse {

    @Test
    public void getSdetCourse() {
        RestAssured.given()
                .when()
                .get("https://tla-school-api.herokuapp.com/api/school/programs/sdetcourse")
                .prettyPeek();

    }
    @Test
    public void verifyStatusCode() {
        RestAssured.given()
                .when()
                .get("https://tla-school-api.herokuapp.com/api/school/programs/sdetcourse")
                .then()
                .assertThat()
                .statusCode(200);
        System.out.println("Status code passed");

    }

    @Test
    public void verifyContentTypeJsonAndStatusCOde(){
        RestAssured.given()
                .when()
                .get("https://tla-school-api.herokuapp.com/api/school/programs/sdetcourse")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .and()
                .statusCode(200);
        System.out.println("Verified Content-type Json and Status code, successfully");
    }
}
