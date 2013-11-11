/**
 * 
 */
package com.payjar.cxf;

import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 * @author Rashid.Limbada
 *
 */
public class HeaderHandlerResolver implements HandlerResolver {

	@SuppressWarnings("rawtypes")
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		 List<Handler> handlerChain = new java.util.ArrayList<Handler>();

	      HeaderHandler hh = new HeaderHandler();

	      handlerChain.add(hh);

	      return handlerChain;
	   }

}
