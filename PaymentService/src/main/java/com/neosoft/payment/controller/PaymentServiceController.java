package com.neosoft.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.payment.consumer.CartServiceConsumer;

@RestController
@RequestMapping("/payment")
public class PaymentServiceController {
	
	 @Autowired
     private CartServiceConsumer consumer;  // HAS-A

     @GetMapping("/data")
     public String getPaymentData() {
            return "FROM PAYMENT-SERVICE : " + consumer.getCartInfo();
     }
}
	