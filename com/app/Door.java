package com.app;

class Door {
    public final String color;

    public Door(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s", this.color);
    }
}