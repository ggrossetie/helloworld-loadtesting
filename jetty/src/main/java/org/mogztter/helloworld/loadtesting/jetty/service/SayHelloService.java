package org.mogztter.helloworld.loadtesting.jetty.service;

import org.springframework.stereotype.Service;

/**
 * @author bloemgracht
 */
@Service(value = "sayHelloService")
public class SayHelloService {

    public String sayHi() {
        return "Hi there !";
    }
}
