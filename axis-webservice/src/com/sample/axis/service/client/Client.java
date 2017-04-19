package com.sample.axis.service.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;


import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;



public class Client {

	
	public static void main(String[] args) {
		
		String endPoint = "http://localhost:8080/axis-webservice/services/HelloService?wsdl";
		Service service = new Service();
		try {
			Call call = (Call)service.createCall();
			call.setTargetEndpointAddress(new URL(endPoint));
			//设置targetNameSpace
			call.setOperationName("sayHello");
			
			//设置传入参数类型
			call.addParameter("name",XMLType.XSD_STRING,ParameterMode.IN);
			//设置返回参数类型
			call.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);

			call.invoke(new Object[]{"huyaozhong"});
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
