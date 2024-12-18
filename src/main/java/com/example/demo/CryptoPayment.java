package com.example.demo;

public class CryptoPayment implements PaymentStrategy {

  @Override
  public void processPayment(double amount) {
    System.out.println("Paying with crypto..." + amount);
  }
}
