# helloworld-loadtesting

Simple Hello World for load testing purpose

# Building
If you already have Maven 3 installed

> mvn install

# Starting load testing
Install Gatling https://github.com/excilys/gatling/downloads
Copy gatling/user-files to $GATLING_HOME
> cp -r gatling/user-files $GATLING_HOME/user-files

## Jetty
Install Jetty
http://docs.codehaus.org/display/JETTY/Downloading+Jetty

Copy the war file after a successful build
> cp jetty/target/jetty-\[version\].war $JETTY_HOME/webapps/

Start Jetty
> cd $JETTY_HOME/bin/
> ./jetty.sh start

Start Gatling
> cd $GATLING_HOME/bin
> ./run.sh

## JBoss AS5
Install JBoss AS 5.1.0
http://www.jboss.org/jbossas/downloads/

Install JBoss WS-CXF 3.2.1 
http://www.jboss.org/jbossws/downloads

Copy the jar file after a successful build
> cp jbossas5/target/jbossas5-\[version\].jar $JBOSSAS5_HOME/server/default/deploy/

Start JBoss AS5
> cd $JBOSSAS5_HOME/bin/
> ./run.sh

Start Gatling
> cd $GATLING_HOME/bin
> ./run.sh

## JBoss AS7
Install JBoss AS 7.1.1
http://www.jboss.org/jbossas/downloads/

Copy the jar file after a successful build
> cp jbossas7/target/jbossas7-\[version\].jar $JBOSSAS7_HOME/standalone/deployments/

Start JBoss AS7
> cd $JBOSSAS7_HOME/bin/
> ./standalone.sh

Start Gatling
> cd $GATLING_HOME/bin
> ./run.sh