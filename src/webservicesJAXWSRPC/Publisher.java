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
        System.out.println("Attemptring to start Student web service");
        Endpoint.publish("http://localhost:1231/ws/student",new WebServices());
        System.out.println("Student web service started");
    }
}
