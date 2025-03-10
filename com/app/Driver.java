package com.app;

import java.io.*;

public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}