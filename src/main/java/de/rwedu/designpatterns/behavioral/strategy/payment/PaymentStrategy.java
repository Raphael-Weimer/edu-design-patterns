package de.rwedu.designpatterns.behavioral.strategy.payment;

public interface PaymentStrategy {

  void collectPaymentDetails();
  boolean validatePaymentDetails();
  String pay(int amount);

}
