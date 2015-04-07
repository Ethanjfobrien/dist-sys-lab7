/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloService;

import javax.ejb.Stateless;

/**
 *
 * @author puser
 */
@Stateless
public class HelloServiceBean implements HelloServiceBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    @Override
    public String helloName(String name) {
        return "Hello " + name;
    }
}
