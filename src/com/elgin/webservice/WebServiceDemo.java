
package com.elgin.webservice;

import javax.jws.WebMethod;

public class WebServiceDemo {

    //
    //"http://localhost:8080/AxisWebDemo/services/myService?wsdl"
    //环境：JDK 1.7, Tomcat7

    public String  sayHello(String name){
        return "hello " + name;
    }

    //不发布
    @WebMethod(exclude=true)
    public static int getAge(){
        return 26;
    }

}
