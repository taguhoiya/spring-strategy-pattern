package com.example.demo;

public class Client {

  public static void main(String[] args) {
    PaymentProcessor processor = new PaymentProcessor();

    processor.setPaymentStrategy(new CreditCardPayment());
    processor.processPayment(100.0);

    processor.setPaymentStrategy(new CryptoPayment());
    processor.processPayment(200.0);

    processor.setPaymentStrategy(new PayPalPayment());
    processor.processPayment(300.0);
  }
}