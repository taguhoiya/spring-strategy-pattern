package com.example.demo;

public class Client {

  public static void main(String[] args) {
    PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
    paymentContext.performPay();

    paymentContext = new PaymentContext(new PayPalPayment());
    paymentContext.performPay();

    paymentContext = new PaymentContext(new Crypto());
    paymentContext.performPay();
  }
}