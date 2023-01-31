package de.rwedu.designpatterns.behavioral.strategy.service;

import de.rwedu.designpatterns.behavioral.strategy.payment.CreditCardPayment;
import de.rwedu.designpatterns.behavioral.strategy.payment.PaypalPayment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentServiceTest {

  private final PaymentService paymentService = new PaymentService(1337, true, null);

  @Test
  public void assertPaymentServiceWorksCorrectlyForCreditCardPayment() {
    paymentService.setStrategy(new CreditCardPayment());
    final String paymentResult = paymentService.processOrder();
    assertEquals("Paying 1347 using Credit Card", paymentResult);
  }

  @Test
  public void assertPaymentServiceWorksCorrectlyForPayPal() {
    paymentService.setStrategy(new PaypalPayment());
    final String paymentResult = paymentService.processOrder();
    assertEquals("Paying 1347 using Paypal", paymentResult);
  }

}