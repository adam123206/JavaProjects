package com.jws.main;

import javax.xml.ws.Endpoint;

import com.jws.serviceInterface.HelloWorld;
import com.jws.serviceInterface.Imp.HelloWorldImp;

public class Main {


	public static void main(String[] args) {
		
		String address ="http://localhost:9000/service";
		HelloWorld helloWorld = new HelloWorldImp();
		Endpoint.publish(address, helloWorld);
	}
}
