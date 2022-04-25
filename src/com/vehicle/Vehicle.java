package com.vehicle;

public class Vehicle {
    private int maxSpeed;


    private double maxWeight;
    private int enginePower;
    private float engineVolume;
    private String vinCode;
    private int sitCount;
    private short yearOfProduction;
    private String brand;
    private String mark;
    //OwnerPassportNumber need to add object
    private String color;

    private SubType subtype;  //enum
    private FuelType fueltype;

    public Vehicle() {
    }

    private Vehicle(int maxSpeed, double maxWeight, int enginePower, float engineVolume, String vinCode, int sitCount, short yearOfProduction, String brand, String mark, String color, SubType subtype, FuelType fueltype) {
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
        this.vinCode = vinCode;
        this.sitCount = sitCount;
        this.yearOfProduction = yearOfProduction;
        this.brand = brand;
        this.mark = mark;
        this.color = color;
        this.subtype = subtype;
        this.fueltype = fueltype;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getVinCode() {
        return vinCode;
    }

    public int getSitCount() {
        return sitCount;
    }

    public short getYearOfProduction() {
        return yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getMark() {
        return mark;
    }

    public String getColor() {
        return color;
    }

    public SubType getSubtype() {
        return subtype;
    }

    public FuelType getFueltype() {
        return fueltype;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed=" + maxSpeed +
                ", maxWeight=" + maxWeight +
                ", enginePower=" + enginePower +
                ", engineVolume=" + engineVolume +
                ", vinCode='" + vinCode + '\'' +
                ", sitCount=" + sitCount +
                ", yearOfProduction=" + yearOfProduction +
                ", brand='" + brand + '\'' +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", subtype=" + subtype +
                ", fueltype=" + fueltype +
                '}';
    }

    public static class VehicleBuilder {
        private int maxSpeed;
        private double maxWeight;
        private int enginePower;
        private float engineVolume;
        private String vinCode;
        private int sitCount;
        private short yearOfProduction;
        private String brand;
        private String mark;
        //OwnerPassportNumber need to add object
        private String color;

        private SubType subtype;  //enum
        private FuelType fueltype;


        public VehicleBuilder maxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public VehicleBuilder maxWeight(double maxWeight) {
            this.maxWeight = maxWeight;
            return this;
        }

        public VehicleBuilder enginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public VehicleBuilder engineVolume(float engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        public VehicleBuilder vinCode(String vinCode) {
            this.vinCode = vinCode;
            return this;
        }

        public VehicleBuilder sitCount(int sitCount) {
            this.sitCount = sitCount;
            return this;
        }

        public VehicleBuilder yearOfProduction(short yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
            return this;
        }

        public VehicleBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public VehicleBuilder mark(String mark) {
            this.mark = mark;
            return this;
        }

        public VehicleBuilder color(String color) {
            this.color = color;
            return this;
        }

        public VehicleBuilder subtype(SubType subtype) {
            this.subtype = subtype;
            return this;
        }

        public VehicleBuilder fuelType(FuelType fuelType) {
            this.fueltype = fuelType;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(maxSpeed, maxWeight, enginePower, engineVolume, vinCode, sitCount, yearOfProduction, brand, mark, color, subtype, fueltype);
        }
    }
}