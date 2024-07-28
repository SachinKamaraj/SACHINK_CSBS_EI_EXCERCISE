package com.example;

public class ComputerBuilder {
    // Required parameters
    protected final String CPU;
    protected final String RAM;

    // Optional parameters
    protected String storage;
    protected String graphicsCard;
    protected String powerSupply;
    protected String coolingSystem;

    // Constructor for required parameters
    public ComputerBuilder(String CPU, String RAM) {
        this.CPU = CPU;
        this.RAM = RAM;
    }

    // Setter methods for optional parameters
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public ComputerBuilder setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public ComputerBuilder setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
        return this;
    }

    // Build method to create a Computer object
    public Computer build() {
        return new Computer(this);
    }
}
