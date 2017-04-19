package com.hoo.client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.hoo.service.IComplexUserService;


public class SpringUsersWsClient {

 

    public static void main(String[] args) {

        //调用WebService

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        factory.setServiceClass(IComplexUserService.class);

        factory.setAddress("http://localhost:8080/CXFWJS/Users");

        IComplexUserService service = (IComplexUserService) factory.create();

        System.out.println("#############Client getUserByName##############");

        String user = service.getUserByName("hoojo");

        System.out.println(user);

        service.setUser(user);

    }

}