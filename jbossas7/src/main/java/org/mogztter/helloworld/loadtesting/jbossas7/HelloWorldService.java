package org.mogztter.helloworld.loadtesting.jbossas7;

import org.mogztter.helloworld.loadtesting.jbossas7.service.SayHelloService;

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
    private SayHelloService sayHelloService;

    @WebMethod
    public String sayHi() {
        System.out.println("sayHi called");
        return sayHelloService.sayHi();
    }
}