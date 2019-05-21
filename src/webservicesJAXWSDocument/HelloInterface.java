/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicesJAXWSDocument;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author Lahiru Chandima
 */
@WebService
@SOAPBinding (style = Style.DOCUMENT , use = SOAPBinding.Use.LITERAL)
public interface HelloInterface {
    @WebMethod
    String message(String name);
}
