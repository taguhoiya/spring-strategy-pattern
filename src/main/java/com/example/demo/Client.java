package com.example.demo;

public class PaymentProcessor {

  public static void main(String[] args) {
    PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
    paymentContext.performPay();

    paymentContext = new PaymentContext(new PayPalPayment());
    paymentContext.performPay();

    paymentContext = new PaymentContext(new CryptoPayment());
    paymentContext.performPay();
  }
}