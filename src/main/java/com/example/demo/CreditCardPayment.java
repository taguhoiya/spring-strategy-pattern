package com.example.demo;

public class CreditCardPayment implements PaymentStrategy {

  @Override
  public void processPayment(double amount) {
    System.out.println("Paying with credit card..." + amount);
  }
}
