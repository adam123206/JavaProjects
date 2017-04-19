package com.hoo.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
@SuppressWarnings("deprecation")
public class ComplexUserService implements IComplexUserService {

    public String getUserByName(@WebParam(name = "name") String name) {

        return name;
    }

    public void setUser(String user) {

        System.out.println("############Server setUser###########");
        System.out.println("setUser:" + user);
    }

}