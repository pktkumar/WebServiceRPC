package kumar;

import javax.xml.ws.Endpoint;

public class HelloWorldServerPublisher {

	public static void main(String[] args) {

		System.out.println("Beginning to publish HelloWorldService now");
		Endpoint.publish("http://localhost:9099/hw", new HelloWorldServerImpl());
		System.out.println("Done publishing");
	}

}