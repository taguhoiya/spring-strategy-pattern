package com.example.demo;

public class PayPalPayment implements PaymentStrategy {

  @Override
  public void pay() {
    System.out.println("Paying with PayPal...");
  }
}
