package com.example.demo;

public class PayPalPayment implements PaymentStrategy {

  @Override
  public void processPayment(double amount) {
    System.out.println("Paying with PayPal..." + amount);
  }
}
