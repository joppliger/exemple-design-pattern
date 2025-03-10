package com.app;

public class RobotDriver extends Driver {
    private String version;

    public RobotDriver(String name, String version) {
        super(name);

        this.version = version;
    }

    public void greetings(String to) {
        System.out.println(String.format("blip bloup %s bloup", to));
    }

    public void connectToWifi() {
        System.out.println("Connected to network");
    }

    @Override
    public String toString() {
        return String.format("%s v.%s", this.name, this.version);
    }
}