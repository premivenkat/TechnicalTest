package com.Rest.APIs;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAPIs {
	
	@Test(description = "To get the details of employee", priority = 0)
    public void verifyUser() {
 
       // Given
        given()
         
        // When
        .when()
              .get("https://dummy.restapiexample.com/api/v1/employees")
                 
         // Then
         .then()
               .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                // To verify booking id at index 3
                .body("data.employee_name", equalTo("Tiger Nixon, Garrett Winters, Ashton Cox, Cedric Kelly, Airi Satou, Brielle Williamson, Herrod Chandler, Rhona Davidson, Colleen Hurst, Sonya Frost, Jena Gaines, Quinn Flynn, Charde Marshall, Haley Kennedy, Tatyana Fitzpatrick, Michael Silva, Paul Byrd, Gloria Little, Bradley Greer, Dai Rios, Jenette Caldwell, Yuri Berry, Caesar Vance, Doris Wilder"))
                .body("message", equalTo("Successfully! Record has been fetched."));
    }
	
	@Test(description = "To get the details of employee", priority = 1)
    public void verifyUser2() {
 
       // Given
        given()
         
        // When
        .when()
              .get("https://dummy.restapiexample.com/api/v1/employee/3")
                 
         // Then
         .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                // To verify booking id at index 3
                .body("data.employee_name", equalTo("Ashton Cox"))
                .body("message", equalTo("Successfully! Record has been fetched."));
    }

}
