package com.app;

public class RobotDriver extends Driver {
    private String version;

    public RobotDriver(String name, String version) {
        super(name);

        this.version = version;
    }

    @Override
    public String toString() {
        return String.format("%s v.%s", this.name, this.version);
    }
}