package de.rwedu.designpatterns.creational.factorypattern.model;

import lombok.Data;

@Data
public abstract class Versicherung {

    private String versicherer;
    private double beritrag;

}
