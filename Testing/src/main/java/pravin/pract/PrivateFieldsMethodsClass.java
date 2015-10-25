package pravin.pract;

import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 * Created by bharati on 10/25/2015.
 */
public class PrivateFieldsMethodsClass {
    public String publicVar = "this is public variable";
    private String privateVar = "this is private variable";

    private String privateMethod(){
        System.out.println("Inside private method");
        return "privateMethodReturnValue";
    }

    public void printVariables(){
        System.out.println("publicVar: " + publicVar);
        System.out.println("privateVar: " + privateVar);
    }
}
