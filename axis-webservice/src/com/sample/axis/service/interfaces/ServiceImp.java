package com.sample.axis.service.interfaces;

import com.sample.axis.service.interfacesImp.Service;

public class ServiceImp implements Service {

	/* (non-Javadoc)
	 * @see com.sample.axis.service.interfacesImp.Service#sayHello(java.lang.String)
	 */
	public String sayHello(String name){
		
		System.out.println(name);
		return "hello "+name;
	}
}
