package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostDelPut_API {
@Test
    public void test1(){
RequestSpecification request= RestAssured.given();
request.header("Content-Type","application/json");

    JSONObject json = new JSONObject();
    json.put("id",110);
    json.put("title","Test The text update");
    json.put("author","tester1");
    request.body(json.toJSONString());
    Response response = request.post("http://localhost:3000/posts");
    int code =response.getStatusCode();
    Assert.assertEquals(code,201);
    System.out.println("response.getStatusCode() = "+code);

    }

    @Test
    public void test2() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        Response response = request.delete("http://localhost:3000/posts/110");
        int code = response.getStatusCode();
    Assert.assertEquals(code,200);
        System.out.println("response.getStatusCode() = " + code);
    }
    @Test
    public void test3(){
        RequestSpecification request= RestAssured.given();
        request.header("Content-Type","application/json");

        JSONObject json = new JSONObject();
        json.put("id", 10);
        json.put("title","Test text update");
        json.put("author","tester_new");
        request.body(json.toJSONString());
        Response response = request.put("http://localhost:3000/posts/11");
        int code =response.getStatusCode();
        Assert.assertEquals(code,200);
        System.out.println("response.getStatusCode() = "+code);

    }

}
