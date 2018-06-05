package client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import kumar.HelloWorldServer;

public class HelloWorldClient {

	public static void main(String[] args) {

		try {

			URL url = new URL("http://localhost:9099/hw?wsdl");
			QName qname = new QName("http://kumar/",
					"HelloWorldServerImplService");

			Service service = Service.create(url, qname);

			HelloWorldServer server = service.getPort(HelloWorldServer.class);
			String name = "Kumar Vaduganathan";
			System.out.println(server.sayHello(name));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}