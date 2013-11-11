package com.payjar.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2012-08-30T19:16:42.645+02:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "http://soap.api.controller.web.payjar.com/", name = "EnterpriseAPISoap")
@XmlSeeAlso({ObjectFactory.class})
public interface EnterpriseAPISoap {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getTransaction", targetNamespace = "http://soap.api.controller.web.payjar.com/", className = "com.payjar.cxf.GetTransaction")
    @WebMethod
    @ResponseWrapper(localName = "getTransactionResponse", targetNamespace = "http://soap.api.controller.web.payjar.com/", className = "com.payjar.cxf.GetTransactionResponse")
    public com.payjar.cxf.GetTransactionResponseMessage getTransaction(
        @WebParam(name = "Api", targetNamespace = "")
        java.lang.String api,
        @WebParam(name = "Safekey", targetNamespace = "")
        java.lang.String safekey,
        @WebParam(name = "AdditionalInformation", targetNamespace = "")
        com.payjar.cxf.AdditionalInfo additionalInformation
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "doTransaction", targetNamespace = "http://soap.api.controller.web.payjar.com/", className = "com.payjar.cxf.DoTransaction")
    @WebMethod
    @ResponseWrapper(localName = "doTransactionResponse", targetNamespace = "http://soap.api.controller.web.payjar.com/", className = "com.payjar.cxf.DoTransactionResponse")
    public com.payjar.cxf.DoTransactionResponseMessage doTransaction(
        @WebParam(name = "Api", targetNamespace = "")
        java.lang.String api,
        @WebParam(name = "Safekey", targetNamespace = "")
        java.lang.String safekey,
        @WebParam(name = "TransactionType", targetNamespace = "")
        com.payjar.cxf.TransactionType transactionType,
        @WebParam(name = "AuthenticationType", targetNamespace = "")
        com.payjar.cxf.AuthenticationType authenticationType,
        @WebParam(name = "AdditionalInformation", targetNamespace = "")
        com.payjar.cxf.AdditionalInfo additionalInformation,
        @WebParam(name = "Customer", targetNamespace = "")
        com.payjar.cxf.Customer customer,
        @WebParam(name = "Basket", targetNamespace = "")
        com.payjar.cxf.Basket basket,
        @WebParam(name = "Fraud", targetNamespace = "")
        com.payjar.cxf.Fraud fraud,
        @WebParam(name = "Creditcard", targetNamespace = "")
        java.util.List<com.payjar.cxf.CreditCard> creditcard,
        @WebParam(name = "Eft", targetNamespace = "")
        java.util.List<com.payjar.cxf.Eft> eft,
        @WebParam(name = "Loyalty", targetNamespace = "")
        java.util.List<com.payjar.cxf.LoyaltyCard> loyalty,
        @WebParam(name = "BankTransfer", targetNamespace = "")
        java.util.List<com.payjar.cxf.BankTransfer> bankTransfer,
        @WebParam(name = "Wallet", targetNamespace = "")
        java.util.List<com.payjar.cxf.Wallet> wallet,
        @WebParam(name = "ThirdParty", targetNamespace = "")
        java.util.List<com.payjar.cxf.ThirdParty> thirdParty,
        @WebParam(name = "Ebucks", targetNamespace = "")
        java.util.List<com.payjar.cxf.Ebucks> ebucks,
        @WebParam(name = "Autopay", targetNamespace = "")
        com.payjar.cxf.AutoPay autopay,
        @WebParam(name = "Customfield", targetNamespace = "")
        java.util.List<com.payjar.cxf.CustomField> customfield,
        @WebParam(name = "Credit", targetNamespace = "")
        com.payjar.cxf.Credit credit,
        @WebParam(name = "TransactionRecord", targetNamespace = "")
        com.payjar.cxf.TransactionRecord transactionRecord
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "setTransaction", targetNamespace = "http://soap.api.controller.web.payjar.com/", className = "com.payjar.cxf.SetTransaction")
    @WebMethod
    @ResponseWrapper(localName = "setTransactionResponse", targetNamespace = "http://soap.api.controller.web.payjar.com/", className = "com.payjar.cxf.SetTransactionResponse")
    public com.payjar.cxf.SetTransactionResponseMessage setTransaction(
        @WebParam(name = "Api", targetNamespace = "")
        java.lang.String api,
        @WebParam(name = "Safekey", targetNamespace = "")
        java.lang.String safekey,
        @WebParam(name = "TransactionType", targetNamespace = "")
        com.payjar.cxf.TransactionType transactionType,
        @WebParam(name = "Stage", targetNamespace = "")
        java.lang.Boolean stage,
        @WebParam(name = "AdditionalInformation", targetNamespace = "")
        com.payjar.cxf.AdditionalInfo additionalInformation,
        @WebParam(name = "Customer", targetNamespace = "")
        com.payjar.cxf.Customer customer,
        @WebParam(name = "Basket", targetNamespace = "")
        com.payjar.cxf.Basket basket,
        @WebParam(name = "Fraud", targetNamespace = "")
        com.payjar.cxf.Fraud fraud,
        @WebParam(name = "Creditcard", targetNamespace = "")
        java.util.List<com.payjar.cxf.CreditCard> creditcard,
        @WebParam(name = "Eft", targetNamespace = "")
        java.util.List<com.payjar.cxf.Eft> eft,
        @WebParam(name = "Loyalty", targetNamespace = "")
        java.util.List<com.payjar.cxf.LoyaltyCard> loyalty,
        @WebParam(name = "BankTransfer", targetNamespace = "")
        java.util.List<com.payjar.cxf.BankTransfer> bankTransfer,
        @WebParam(name = "Ebucks", targetNamespace = "")
        com.payjar.cxf.Ebucks ebucks,
        @WebParam(name = "Autopay", targetNamespace = "")
        com.payjar.cxf.AutoPay autopay,
        @WebParam(name = "Customfield", targetNamespace = "")
        java.util.List<com.payjar.cxf.CustomField> customfield,
        @WebParam(name = "TransactionRecord", targetNamespace = "")
        com.payjar.cxf.TransactionRecord transactionRecord
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getLookupTransaction", targetNamespace = "http://soap.api.controller.web.payjar.com/", className = "com.payjar.cxf.GetLookupTransaction")
    @WebMethod
    @ResponseWrapper(localName = "getLookupTransactionResponse", targetNamespace = "http://soap.api.controller.web.payjar.com/", className = "com.payjar.cxf.GetLookupTransactionResponse")
    public com.payjar.cxf.LookupTransactionResponseMessage getLookupTransaction(
        @WebParam(name = "Api", targetNamespace = "")
        java.lang.String api,
        @WebParam(name = "Safekey", targetNamespace = "")
        java.lang.String safekey,
        @WebParam(name = "lookupTransactionType", targetNamespace = "")
        com.payjar.cxf.LookupTransactionType lookupTransactionType,
        @WebParam(name = "Customfield", targetNamespace = "")
        java.util.List<com.payjar.cxf.CustomField> customfield
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "hi", targetNamespace = "http://soap.api.controller.web.payjar.com/", className = "com.payjar.cxf.Hi")
    @WebMethod
    @ResponseWrapper(localName = "hiResponse", targetNamespace = "http://soap.api.controller.web.payjar.com/", className = "com.payjar.cxf.HiResponse")
    public java.lang.String hi();
}