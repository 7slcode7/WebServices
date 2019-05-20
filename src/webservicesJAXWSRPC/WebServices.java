/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesJAXWSRPC;

import javax.jws.WebService;

/**
 *
 * @author Lahiru Chandima
 * Below web service is implemented using JAX WS API
 */
@WebService (endpointInterface = "webservices.StudentWebService")
public class WebServices implements StudentWebService{
    

    /**
     * @param args the command line arguments
     */
    

    @Override
    public String getHelloMessage(String name) {
        return "JAX WS says Hello " + name ;
    }
    
}
