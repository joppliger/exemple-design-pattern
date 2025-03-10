package com.app;

public class HumanDriver extends Driver {
    private String surname;

    public HumanDriver(String name, String surname) {
        super(name);

        this.surname = surname;
    }

    public void greetings(String to) {
        System.out.printf("Hi %s !");
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.surname.toUpperCase());
    }
}