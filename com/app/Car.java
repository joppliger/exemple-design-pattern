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
        if(this.pilot != null) {
            throw new IllegalStateException("A pilot is already there");
        }

        this.pilot = driver;
    }

    public void sitCopilot(Driver driver) {
        if(this.pilot != null) {
            throw new IllegalStateException("A copilot is already there");
        }

        this.copilot = driver;
    }

    private boolean isWheelExists(int index) {
        return this.wheels[index] != null;
    }

    public void mountWheel(int index) {
        if(this.isWheelExists(index) == true) {
            throw new IllegalStateException("Impossible to mount a wheel that already exists");
        }

        this.wheels[index] = new Wheel();
    }

    public void unmountWheel(int index) {
        if(this.isWheelExists(index) == false) {
            throw new IllegalStateException("Impossible to mount a wheel that already exists");
        }

        this.wheels[index] = null;
    }

    private int getWheelsNumber() {
        int counter = 0;
        for(int i = 0; i < this.wheels.length; i++) {
            if(this.wheels[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public void drive() {
        if(this.pilot == null) {
            throw new IllegalStateException("A driver is missing");
        }
        if(this.getWheelsNumber() < this.wheels.length) {
            throw new IllegalStateException("Missing some wheels");
        }

        System.out.println("Vroooum !");
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.brand, this.model);
    }
}