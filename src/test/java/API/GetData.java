package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetData {
    @Test
    public void testResponseCode(){

        Response resp=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London&appid=309a567b71fbfdf0b420f7615dd6e863");
        int code = resp.getStatusCode();
        System.out.println("Status CODE is: " + code);
        Assert.assertEquals(code,200);
    }
    @Test
    public void testBody(){

        Response resp=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London&appid=309a567b71fbfdf0b420f7615dd6e863");
        String data = resp.asString();
        System.out.println("Status DATA is: " + data);
        System.out.println("Responce time: "+resp.getTime());
    }
}
