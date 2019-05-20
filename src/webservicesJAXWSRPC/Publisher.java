/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesJAXWSRPC;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Lahiru Chandima
 */
public class Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1231/ws/student",new WebServices());
    }
}
