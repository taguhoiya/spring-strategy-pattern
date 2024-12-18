package com.example.demo;

public class PaymentProcessor {

  private PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void processPayment(double amount) {
    paymentStrategy.processPayment(amount);
  }
}
