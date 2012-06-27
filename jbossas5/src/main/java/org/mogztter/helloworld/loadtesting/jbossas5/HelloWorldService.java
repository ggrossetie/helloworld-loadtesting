package org.mogztter.helloworld.loadtesting.jbossas5;

import org.mogztter.helloworld.loadtesting.jbossas5.service.SayHello;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author bloemgracht
 */
@Stateless
@WebService
public class HelloWorldService {

    @EJB
    private SayHello sayHelloService;

    @WebMethod
    public String sayHi() {
        System.out.println("sayHi called");
        return sayHelloService.sayHi();
    }
}