package com.vehicle.land;

import com.vehicle.FuelType;
import com.vehicle.SubType;

public class Car extends LandVehicle implements CarService{

    public Car(int maxSpeed, double maxWeight, int enginePower, float engineVolume, String vinCode, int sitCount, short yearOfProduction, String brand, String mark, String color, SubType subtype, FuelType fueltype) {
       // super(maxSpeed, maxWeight, enginePower, engineVolume, vinCode, sitCount, yearOfProduction, brand, mark, color, subtype, fueltype);
    }

    /* public Car(int maxSpeed, double maxWeight, int enginePower, float engineVolume, String vinCode, int sitCount,
                   short yearOfProduction, String brand, String mark, String color) {
            super(maxSpeed, maxWeight, enginePower, engineVolume, vinCode, sitCount, yearOfProduction, brand, mark, color);
        }
    */
    @Override
    public int wheelCount() {
        return 0;
    }
}
