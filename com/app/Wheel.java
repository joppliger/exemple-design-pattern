package com.app;

import java.io.*;

public class Wheel {
    private double rotation;
    private int speed;

    public Wheel() {
        this.rotation = 90.0; // 90 is straight
        this.speed = 0;
    }

    private double lerp(double start, double end, double t) {
        return start + t * (end - start);
    }

    public void rotate(double degree) {
        double rotation = this.rotation;
        rotation += degree;

        if(rotation < 0 || rotation > 180) {
            throw new IllegalStateException("You cannot rotate so much");
        } 

        this.rotation = this.lerp(this.rotation, degree, 0.5);
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }

    public int getSpeed() {
        return this.speed;
    }

    public double getRotation() {
        return this.rotation;
    }
}