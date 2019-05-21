/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesJAXWSDocument;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Lahiru Chandima
 */
public class HelloClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:1238/wsdoc/hello?wsdl");
        QName qname = new QName("http://webservicesJAXWSDocument/", "HelloImplService");
        Service service = Service.create(url , qname);
        HelloInterface obj = service.getPort(HelloInterface.class);
        System.out.println(obj.message("Lahiru"));
    }
}
