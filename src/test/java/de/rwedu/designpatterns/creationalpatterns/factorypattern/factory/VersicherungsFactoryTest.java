package de.rwedu.designpatterns.creationalpatterns.factorypattern.factory;

import de.rwedu.designpatterns.creationalpatterns.factorypattern.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VersicherungsFactoryTest {

  @Test
  public void assertVersicherungsFactoryCreatesKrankenversicherungCorrectly() {
    final Versicherung versicherung = VersicherungsFactory.createByType(VersicherungTyp.KRANKEN);
    assertAll(
        () -> assertNotNull(versicherung),
        () -> assertTrue(versicherung instanceof Krankenversicherung)
    );
  }

  @Test
  public void assertVersicherungsFactoryCreatesKfzVersicherungCorrectly() {
    final Versicherung versicherung = VersicherungsFactory.createByType(VersicherungTyp.KFZ);
    assertAll(
        () -> assertNotNull(versicherung),
        () -> assertTrue(versicherung instanceof KfzVersicherung)
    );
  }

  @Test
  public void assertVersicherungsFactoryCreatesHausratVersicherungCorrectly() {
    final Versicherung versicherung = VersicherungsFactory.createByType(VersicherungTyp.HAUSRAT);
    assertAll(
        () -> assertNotNull(versicherung),
        () -> assertTrue(versicherung instanceof Hausratversicherung)
    );
  }

}