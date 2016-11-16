package it.alfasoft.viviana.mainfattura;


import it.alfasoft.viviana.FatturaService;

import javax.xml.ws.Endpoint;

public class main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1240/EsempioFatture",new FatturaService());
		
	}

}
