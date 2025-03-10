package com.app;

import java.io.*;


public class Car {
    public String brand;
    public String model;
    public Wheel[] wheels = new Wheel[4];
    public Driver pilot;
    public Driver copilot;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;

        for (int i = 0; i < this.wheels.length; i++) {
            this.wheels[i] = new Wheel();
        }
    }

    public void sitPilot(Driver driver) {
        this.pilot = driver;
    }

    public void sitCopilot(Driver driver) {
        this.copilot = driver;
    }

    public void mountWheel(int index) {
        this.wheels[index] = new Wheel();
    }

    public void unmountWheel(int index) {
        this.wheels[index] = null;
    }

    public void drive() {
        // Does Pilot drive ?
        if(this.pilot == null) {
            throw new IllegalStateException("A driver is missing");
        }
        // Does 4 wheels exists ?
        int counter = 0;
        for(int i = 0; i < this.wheels.length; i++) {
            if(this.wheels[i] != null) {
                counter++;
            }
        }
        if(counter != this.wheels.length) {
            throw new IllegalStateException("Missing some wheels");
        }

        System.out.println("Vroooum !");
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.brand, this.model);
    }
}