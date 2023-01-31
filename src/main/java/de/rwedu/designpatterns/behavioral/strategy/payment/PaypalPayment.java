package de.rwedu.designpatterns.behavioral.strategy.payment;

public class PaypalPayment implements PaymentStrategy {

  private String email;
  private String password;

  @Override
  public void collectPaymentDetails() {
  }

  @Override
  public boolean validatePaymentDetails() {
    return true;
  }

  @Override
  public String pay(int amount) {
    return "Paying " + amount + " using Paypal";
  }

}
