package pravin.pract.serviceclient;

import pravin.pract.service.HelloWorld;
import pravin.pract.service.HelloWorldImplService;
public class JAXWSClient {

    /**
     * @author Arpit Mandliya
     */
    public static void main(String[] args) {
        
        HelloWorldImplService helloWorldService = new HelloWorldImplService();
        HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();
        System.out.println(helloWorld.helloWorld(" someone "));
    }
}

