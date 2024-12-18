package com.example.demo;

public class PayPalPaymentStrategy implements PaymentStrategy {

  @Override
  public void pay() {
    System.out.println("Paying with PayPal...");
  }
}
