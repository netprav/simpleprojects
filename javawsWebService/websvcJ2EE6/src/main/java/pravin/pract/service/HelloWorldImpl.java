package pravin.pract.service;

import javax.jws.WebService;

@WebService(endpointInterface="pravin.pract.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

 public String helloWorld(String name) {
  return "Hello world from "+name;
 }

}
