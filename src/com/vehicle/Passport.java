package com.vehicle;

public final class Passport {
    public String name;
    public Vehicle  vehicle;

    public Passport(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
