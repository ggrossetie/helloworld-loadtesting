package org.mogztter.helloworld.loadtesting.jbossas5.service;

import javax.ejb.Local;

/**
 * @author bloemgracht
 */
@Local
public interface SayHello {
    String sayHi();
}
