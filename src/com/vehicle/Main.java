package com.vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.vehicle.Vehicle.*;

public class Main {
    public static void main(String[] args) {


      Map<String,Vehicle> map = new HashMap<>();

        map.put("Vazgen",new VehicleBuilder().mark("BMW").build());
        map.put("Petros",new VehicleBuilder().mark("Mercedes").build());
        map.put("Armen",new VehicleBuilder().mark("Lexus").build());

        try {
            Vehicle s = map.get("Petros");
            System.out.println(s.getMark());
        }catch (Exception e){
            System.out.println("not found");
        }

      /*  Passport [] pass = new Passport[2];
        pass[0]= new Passport("Vazgen",new VehicleBuilder().mark("BMW").build());
        pass[1]= new Passport("Petros",new VehicleBuilder().mark("Mercedes").build());
        Scanner sc = new Scanner(System.in);
        String next = sc.next();

        for (Passport passport : pass) {
            if (passport.getName().equals(next)) {
                System.out.println(passport.getVehicle());
            }
        }
*/


    }
}
