
import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._

class HellowWorldAS5Simulation extends Simulation {

def apply ={
	val urlBase = "http://localhost:8080"

	val httpConf = httpConfig.baseURL(urlBase)


	val headers_2 = Map(
		"Accept-Encoding" -> """gzip,deflate""",
		"Content-Length" -> """534""",
		"Content-Type" -> """text/xml;charset=UTF-8""",
		"Host" -> """localhost:8080""",
		"SOAPAction" -> """"authenticate"""",
		"User-Agent" -> """Apache-HttpClient/4.1.1 (java 1.5)"""
	)
	val chain_1 = chain.exec(
			http("request_1")
			.post("/jbossas5-1.0/HelloWorldService")
			.headers(headers_2)
			.fileBody("helloworld-as5.txt")
			
		)
	
	
	val scn = scenario("Scenario name").pause(50,100)
			.loop(chain_1).times(100)

	List(
		scn.configure users 5000 ramp 100 protocolConfig httpConf
	)
}
}
