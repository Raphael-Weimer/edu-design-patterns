package de.rwedu.designpatterns.behavioral.strategy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreditCard {

  private String cardNumber;
  private String dateOfExpiry;
  private String cvv;

}
