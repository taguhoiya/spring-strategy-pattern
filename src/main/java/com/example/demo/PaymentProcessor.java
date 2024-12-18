package com.example.demo;

public class PaymentContext {

  private PaymentStrategy paymentStrategy;

  public PaymentContext(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void performPay(double amount) {
    paymentStrategy.pay(amount);
  }
}
