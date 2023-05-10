package javatest;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import org.json.JSONObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;


public class denemefile {

    protected Logger log = Logger.getLogger(getClass());


    Response response;

    JSONObject object = null;

    String getUrl = "https://jsonplaceholder.typicode.com/posts/1";
    String postUrl = "https://jsonplaceholder.typicode.com/posts";

    int number =0;

    @Test
    public void givenNumber_whenEven_thenTrue() {
        assertTrue(number % 2 == 0);
    }

    @BeforeClass
    public void setup() {
        number = 24;
    }

    @AfterClass
    public void tearDown() {
        number = 0;
    }



}
