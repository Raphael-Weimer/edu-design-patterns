package de.rwedu.designpatterns.behavioral.strategy.payment;

import de.rwedu.designpatterns.behavioral.strategy.model.CreditCard;

public class CreditCardPayment implements PaymentStrategy {

  private CreditCard card;

  @Override
  public void collectPaymentDetails() {
    card = new CreditCard("cradNumber", "expiryDate", "cvv");
  }

  @Override
  public boolean validatePaymentDetails() {
    return true;
  }

  @Override
  public String pay(int amount) {
    return "Paying " + amount + " using Credit Card";
  }

}
