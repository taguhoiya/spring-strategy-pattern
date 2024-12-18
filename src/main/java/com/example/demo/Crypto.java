package com.example.demo;

public class CryptoCurrencyPaymentStrategy implements PaymentStrategy {

  @Override
  public void pay() {
    System.out.println("Paying with cryptocurrency...");
  }
}
