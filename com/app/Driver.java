package com.app;

import java.io.*;

public abstract class Driver {
    protected String name;

    public Driver(String name) {
        this.name = name;
    }

    public abstract void greetings(String to);

    @Override
    public String toString() {
        return this.name;
    }
}