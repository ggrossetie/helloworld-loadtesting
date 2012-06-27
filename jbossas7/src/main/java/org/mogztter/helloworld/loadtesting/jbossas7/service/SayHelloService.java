package org.mogztter.helloworld.loadtesting.jbossas7.service;

import javax.ejb.Stateless;

/**
 * @author bloemgracht
 */
@Stateless
public class SayHelloService {

    public String sayHi() {
        return "Hi there !";
    }
}
