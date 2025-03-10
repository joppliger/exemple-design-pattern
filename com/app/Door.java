package com.app;

import java.io.*;

class Door {
    public final String color;
    public boolean isOpen; 

    public Door(String color, boolean isOpen) {
        this.color = color;
        this.isOpen = isOpen;
    }

    public void open() {
        this.isOpen = true;
    }
    
    public void close() {
        this.isOpen = false;
    }

    @Override
    public String toString() {
        return String.format("the %s door is %s", this.color, this.isOpen ? "open" : "close");
    }
}