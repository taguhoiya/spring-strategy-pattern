package com.example.demo;

public class CryptoPayment implements PaymentStrategy {

  @Override
  public void pay() {
    System.out.println("Paying with cryptocurrency...");
  }
}
