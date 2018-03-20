package Server;

import javax.xml.ws.Endpoint;

public class WebServiceServer {

	public static void main(String[] args) {
		String url = "http://localhost:8090";
		MitarbeiterService service = new MitarbeiterService();

		String calculatorURL = url + "/mitarbeiter";

		Endpoint endpoint = Endpoint.publish(calculatorURL, service);
		System.out.println("Server is running... " + url);
		System.out.println("Calculator WSDL=" + calculatorURL + "?wsdl");
	}

}
