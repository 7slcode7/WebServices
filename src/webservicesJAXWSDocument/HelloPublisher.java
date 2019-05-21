/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesJAXWSDocument;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Lahiru Chandima
 */
public class HelloPublisher {
    public static void main(String[] args) {
        System.out.println("Hello Service attempting to start");
        Endpoint.publish("http://localhost:1238/wsdoc/hello", new HelloImpl());
        System.out.println("Hello Service started");
    }
}
