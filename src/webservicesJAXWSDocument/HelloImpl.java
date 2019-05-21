/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesJAXWSDocument;

import javax.jws.WebService;

/**
 *
 * @author Lahiru Chandima
 */
@WebService(endpointInterface = "webservicesJAXWSDocument.HelloInterface")
public class HelloImpl implements HelloInterface{

    @Override
    public String message(String name) {
        return "JAX WS Document style says Hello " + name ;
    }
    
}
