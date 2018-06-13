package example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class getUserName {
    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }


    @WebMethod
    public String getPassword(String name) {
        return name;
    }


    @WebMethod
    public int add(int i, int j) {
        return i + j;
    }

    public static void main(String[] argv) {
        Object implementor = new getUserName();
        String address = "http://localhost:9000/getUserName";
        Endpoint.publish(address, implementor);
    }
}
