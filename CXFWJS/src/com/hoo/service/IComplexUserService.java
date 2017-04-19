package com.hoo.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**

 * <b>function:</b>定制客户端请求WebService所需要的接口

 * @author hoojo

 * @createDate 2011-3-18 上午08:22:55

 * @file ComplexUserService.java

 * @package com.hoo.service

 * @project CXFWebService

 * @blog http://blog.csdn.net/IBM_hoojo

 * @email hoojo_@126.com

 * @version 1.0

 */

@WebService
@SOAPBinding(style = Style.RPC)
public interface IComplexUserService {

    public String getUserByName(@WebParam(name = "name") String name);

    public void setUser(String user);

}