package pravin.pract.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/*
 * to run client for this webservice, 
 * use wsimport with url http://127.0.0.1:8080/service?wsdl
 * cmdprompt# wsimport -s . http://localhost:8080/WS/HelloWorld?wsdl
 * wsimport will generate stub classes which could be used by 
 * client as specified in commented method below 
 * 
 * deploying same in tomcat server would need to use wsgen to create specific bindings
 * & web.xml configuratins along with sun-javaws.xml containing endpoint specs
 * for more see http://www.java2blog.com/2013/03/jaxws-webservice-deployement-on-tomcat.html
 */

@WebService // need one webservice class, containing webmethod
public class MostSimplestWebService {
	
	@WebMethod public String sayHello(String toPerson){ // one webmethod inside webservic
		return new String ("Saying hello to " + toPerson);
	}
	public static void main(String[] args){  // create endpoint using Java SE internal server
		MostSimplestWebService service = new MostSimplestWebService();   
        Endpoint.publish("http://localhost:8080/service", service);
	}
	
/*	// this must be in different project as client-stub interface 
 * 	// has same name that of service interface from server project
	public static void clientmain(String... args){
        HelloWorldImplService helloWorldService = new HelloWorldImplService();
        HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();
        System.out.println(helloWorld.helloWorld(" someone "));	
	}
*/	
}