package com.app;

import java.io.*;

public class Wheel {
    private int rotation;
    private int speed;

    public Wheel() {
        this.rotation = 0;
        this.speed = 0;
    }

    public void rotate(int degree) {
        this.rotation += degree;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getRotation() {
        return this.rotation;
    }
}