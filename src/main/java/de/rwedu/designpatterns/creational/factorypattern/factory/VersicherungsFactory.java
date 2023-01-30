package de.rwedu.designpatterns.creational.factorypattern.factory;

import de.rwedu.designpatterns.creational.factorypattern.model.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VersicherungsFactory {

    public static Versicherung createByType(final VersicherungTyp versicherungTyp) {
        switch (versicherungTyp) {
            case KRANKEN:
                return new Krankenversicherung();
            case HAUSRAT:
                return new Hausratversicherung();
            case KFZ:
                return new KfzVersicherung();
            default:
                throw new IllegalArgumentException("VersicherungTyp not supported");
        }
    }

}
