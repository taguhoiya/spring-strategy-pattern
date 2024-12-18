package com.example.demo;

public class CreditCardPaymentStrategy implements PaymentStrategy {

  @Override
  public void pay() {
    System.out.println("Paying with credit card...");
  }
}
