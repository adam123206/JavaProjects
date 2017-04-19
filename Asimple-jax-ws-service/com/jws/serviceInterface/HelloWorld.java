package com.jws.serviceInterface;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface HelloWorld {

	String sayHi(@WebParam(name="text") String text);
}
