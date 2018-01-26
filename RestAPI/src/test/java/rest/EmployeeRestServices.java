package rest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class EmployeeRestServices {

    @Test
    public static void apiCallResponse() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources").
                then().statusCode(200).extract().response();
        String status = response.getStatusLine();
        String body = response.getBody().print();
        //Assert.assertEquals(response, 200);
        System.out.println("-----------------------------");
    }
    @Test
    public static void apiCallResponseSingle1() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api" +
                "/SingleEmployeeResources/590cd847355229a408ba9d06").
                then().statusCode(200).extract().response();
        String status = response.getStatusLine();
        String body = response.getBody().print();
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("--------------------------------");
    }
    @Test
    public static void apiCallResponseSingle2() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api" +
                "/SingleEmployeeResources/590a4acd35522970c7956cdf").
                then().statusCode(200).extract().response();
        String status = response.getStatusLine();
        String body = response.getBody().print();
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("--------------------------------");
    }
    @Test
    public static void apiCallResponseSingle3() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api" +
                "/SingleEmployeeResources/59ac2f43c09dea2660451c9d").
                then().statusCode(200).extract().response();
        String status = response.getStatusLine();
        String body = response.getBody().print();
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("--------------------------------");
    }
    @Test
    public static void apiCallResponseSingle4() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api" +
                "/SingleEmployeeResources/590cd940355229a483d89e1f").
                then().statusCode(200).extract().response();
        String status = response.getStatusLine();
        String body = response.getBody().print();
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("--------------------------------");
    }
    @Test
    public static void apiCallResponseSingle5() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api" +
                "/SingleEmployeeResources/590a4ada35522970c7956ce2").
                then().statusCode(200).extract().response();
        String status = response.getStatusLine();
        String body = response.getBody().print();
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("--------------------------------");
    }
    @Test
    public static void apiCallResponseSingle6() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api" +
                "/SingleEmployeeResources/59ac2f0cc09dea2660451c9a").
                then().statusCode(200).extract().response();
        String status = response.getStatusLine();
        String body = response.getBody().print();
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("--------------------------------");
    }
}