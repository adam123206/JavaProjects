package com.jws.serviceInterface.Imp;

import javax.jws.WebService;

import com.jws.serviceInterface.HelloWorld;

@WebService(endpointInterface="com.jws.serviceInterface.HelloWorld",serviceName="HelloWorld")
public class HelloWorldImp implements HelloWorld {

	@Override
	public String sayHi(String text) {
		// TODO Auto-generated method stub
		return "say hi"+text;
	}

}
