package de.rwedu.designpatterns.behavioral.strategy.service;

import de.rwedu.designpatterns.behavioral.strategy.payment.PaymentStrategy;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class PaymentService {

  private int cost;
  private boolean includeDelivery;

  private PaymentStrategy strategy;

  public String processOrder() {
    String result = null;
    strategy.collectPaymentDetails();
    if (strategy.validatePaymentDetails()) {
      result = strategy.pay(getTotal());
    }
    return result;
  }

  private int getTotal() {
    return includeDelivery ? cost + 10 : cost;
  }

}
