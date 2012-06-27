package org.mogztter.helloworld.loadtesting.jetty;

import org.mogztter.helloworld.loadtesting.jetty.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

@WebService(endpointInterface = "org.mogztter.helloworld.loadtesting.jetty.HelloWorld")
public class HelloWorldService implements HelloWorld {

    @Autowired
    private SayHelloService sayHelloService;

    public String sayHi() {
        System.out.println("sayHi called");
        return sayHelloService.sayHi();
    }
}

