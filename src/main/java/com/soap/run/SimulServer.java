package com.soap.run;

import javax.xml.ws.Endpoint;

import com.soap.services.impl.Compte;

public class SimulServer {

	public static void main(String[] args) {
		String url = "http://localhost:1987/";
		Endpoint.publish(url, new Compte());
		System.out.println("Publication service OK ...");
	}

}
