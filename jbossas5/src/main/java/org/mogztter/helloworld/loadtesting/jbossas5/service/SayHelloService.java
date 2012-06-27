package org.mogztter.helloworld.loadtesting.jbossas5.service;

import javax.ejb.Stateless;

/**
 * @author bloemgracht
 */
@Stateless
public class SayHelloService implements SayHello {

    @Override
    public String sayHi() {
        return "Hi there !";
    }
}
