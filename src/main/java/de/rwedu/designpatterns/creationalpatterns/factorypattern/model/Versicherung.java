package de.rwedu.designpatterns.creationalpatterns.factorypattern.model;

import lombok.Data;

@Data
public abstract class Versicherung {

    private String versicherer;
    private double beritrag;

}
