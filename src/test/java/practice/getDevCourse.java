    package practice;

    import io.restassured.RestAssured;
    import io.restassured.http.ContentType;
    import io.restassured.response.Response;
    import org.testng.annotations.Test;


    public class getDevCourse {

        @Test
        public void getDevCourse() {
            RestAssured.given()
                    .when()
                    .get("https://tla-school-api.herokuapp.com/api/school/programs/devcourse")
                    .prettyPeek();

        }
        @Test
        public void verifyStatusCode() {
            RestAssured.given()
                    .when()
                    .get("https://tla-school-api.herokuapp.com/api/school/programs/devcourse")
                    .then()
                    .assertThat()
                    .statusCode(200);
            System.out.println("Status code passed");

        }

        @Test
        public void verifyContentTypeJsonAndStatusCOde(){
            RestAssured.given()
                    .when()
                    .get("https://tla-school-api.herokuapp.com/api/school/programs/devcourse")
                    .then()
                    .assertThat()
                    .contentType(ContentType.JSON)
                    .and()
                    .statusCode(200);
            System.out.println("Verified Dev Course Content-type Json and Status code, successfully");
        }
        @Test
        public void getSdetCourse() {
            RestAssured.given()
                    .when()
                    .get("https://tla-school-api.herokuapp.com/api/school/programs/sdetcourse")
                    .prettyPeek();

        }
        @Test
        public void verifyStatusCodeSdetCourse() {
            RestAssured.given()
                    .when()
                    .get("https://tla-school-api.herokuapp.com/api/school/programs/sdetcourse")
                    .then()
                    .assertThat()
                    .statusCode(200);
            System.out.println("Status code passed");

        }

        @Test
        public void verifyContentTypeJsonAndStatusCodeSdetCourse(){
            RestAssured.given()
                    .when()
                    .get("https://tla-school-api.herokuapp.com/api/school/programs/sdetcourse")
                    .then()
                    .assertThat()
                    .contentType(ContentType.JSON)
                    .and()
                    .statusCode(200);
            System.out.println("Verified Sdet Course Content-type Json and Status code, successfully");
        }
    }
