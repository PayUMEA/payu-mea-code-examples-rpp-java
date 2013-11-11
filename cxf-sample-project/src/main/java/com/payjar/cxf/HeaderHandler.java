/**
 * 
 */
package com.payjar.cxf;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;


public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {

	public boolean handleMessage(SOAPMessageContext smc) {

        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {
            SOAPMessage message = smc.getMessage();

            try {
                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.addHeader();
                SOAPElement security = header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
                SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
                usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
                SOAPElement username = usernameToken.addChildElement("Username", "wsse");
                //Set your username
                username.addTextNode("Standard Bank - Youth Portal");

                SOAPElement password = usernameToken.addChildElement("Password", "wsse");
                password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
                //Set your Password
                password.addTextNode("QOkYBRuK");

                message.writeTo(System.out);
                System.out.println("");
                
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                SOAPMessage message = smc.getMessage();
                message.writeTo(System.out);
                System.out.println("");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return outboundProperty;
    }

    public Set getHeaders() {
        return null;
    }

    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    public void close(MessageContext context) {
    }
}
