/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesJAXWSRPC;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Lahiru Chandima
 */
public class StudentClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:1231/ws/student?wsdl");
        
        QName qname = new QName("http://webservices/","WebServicesService" );
        Service service = Service.create(url, qname);
        StudentWebService obj = service.getPort(StudentWebService.class);
        System.out.println(obj.getHelloMessage("Lahiru"));
        
    }
}
