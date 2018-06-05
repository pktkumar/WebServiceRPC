package kumar;

import javax.jws.WebService;

@WebService(endpointInterface = "kumar.HelloWorldServer")
public class HelloWorldServerImpl implements HelloWorldServer {

	public String sayHello(String name) {
		return "Helloooo " + name + " !, Hope you are doing well !!";
	}

}