package com.payjar.test;

import java.net.URL;

import javax.xml.namespace.QName;

import com.payjar.cxf.AdditionalInfo;
import com.payjar.cxf.ApiVersion;
import com.payjar.cxf.Basket;
import com.payjar.cxf.Customer;
import com.payjar.cxf.DoTransaction;
import com.payjar.cxf.DoTransactionResponseMessage;
import com.payjar.cxf.EnterpriseAPISoap;
import com.payjar.cxf.EnterpriseAPISoapService;
import com.payjar.cxf.HeaderHandlerResolver;
import com.payjar.cxf.SetTransaction;
import com.payjar.cxf.SetTransactionResponseMessage;
import com.payjar.cxf.TransactionType;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		try {
						
			URL url = new URL("https://staging.payu.co.za/service/PayUAPI");
			QName qn = new QName("http://soap.api.controller.web.payjar.com/", "EnterpriseAPISoapService");
			
			EnterpriseAPISoapService esp = new EnterpriseAPISoapService(url, qn);
			
			// Will add the security Header to the Soap Call
			HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
			esp.setHandlerResolver(handlerResolver);

			EnterpriseAPISoap port = esp.getEnterpriseAPISoapPort();
			SetTransaction setTran = TestClient.buildSetTransaction();
			SetTransactionResponseMessage response = port.setTransaction(setTran.getApi(), setTran.getSafekey(), setTran.getTransactionType(), 
					null, setTran.getAdditionalInformation(), setTran.getCustomer(), setTran.getBasket(), null, null, null, null, null, null, null, null, null);
			
			
			DoTransaction doTran = TestClient.buildLookup();
			DoTransactionResponseMessage lookupResponse = port.doTransaction(doTran.getApi(), doTran.getSafekey(), doTran.getTransactionType(), null, 
					doTran.getAdditionalInformation(), doTran.getCustomer(), null, null, null, null, null, null, null, null, null, null, null, null, null);
			
			System.out.println("Done");
			
			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static SetTransaction buildSetTransaction() {
		SetTransaction setTransaction = new SetTransaction();
		setTransaction.setApi(ApiVersion.ONE_ZERO.name());
		
		// AdditionalInfo
		AdditionalInfo addInfo = new AdditionalInfo();
		addInfo.setMerchantReference("Test001");
		addInfo.setCancelUrl("http://www.cancel.co.za");
		addInfo.setReturnUrl("http://www.return.co.za");
		addInfo.setSupportedPaymentMethods("CREDITCARD");
				
		setTransaction.setAdditionalInformation(addInfo);
		
		Basket basket = new Basket();
		basket.setAmountInCents("10000");
		basket.setCurrencyCode("ZAR");
		basket.setDescription("Test Product");
		
		setTransaction.setBasket(basket);
		
		Customer customer = new Customer();
		customer.setFirstName("John");
		customer.setLastName("Doe");
		customer.setEmail("john@doe.com");
		customer.setMobile("0821234567");
		
		setTransaction.setCustomer(customer);
		
		
		setTransaction.setSafekey("{3737A92A-BB02-43BD-B507-4A8DB44E6E02}");
		setTransaction.setTransactionType(TransactionType.PAYMENT);
	
		return setTransaction;
	}
	
	public static DoTransaction buildLookup() {
		DoTransaction lookup = new DoTransaction();
		lookup.setApi(ApiVersion.ONE_ZERO.name());
		lookup.setSafekey("{CE68241F-AA65-48C6-A6BE-660F8098CD31}");
		lookup.setTransactionType(TransactionType.ACCOUNT_LOOKUP);
		
		// AdditionalInfo
		AdditionalInfo addInfo = new AdditionalInfo();
		addInfo.setMerchantReference("Test001");
		lookup.setAdditionalInformation(addInfo);
		
		//Customer
		Customer customer = new Customer();
		customer.setMobile("0821234567");
		
		lookup.setCustomer(customer);
		
		return lookup;
	}
	
}
