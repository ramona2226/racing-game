package org.fasttrackit;

public class Vehicle {


    // instance variable
    String model ;
    String make;
    String color;
    double mileage;
    double fuelLevel;
    double maxSpeed;
    double totalTravelDistance;
    boolean damaged;

    public double accelerate(double speed, double durationInHours) {
// Dacia is accelerating with 60 km/h for 1 h
        System.out.println(make + " is acelerating with " + speed + "km/h for" + durationInHours + "h" +);
        double distance = speed * durationInHours;

                //same result as the statment above;
        // totalTravelDistance += distance;

        System.out.println(: Total traveled distance: " + totalTravelDistance");

        double usedFuel  = distance * milage / 100;
        fuelLevel = fuelLevel - usedFuel;
        fuelLevel-= usedFuel;

        System.out.println("Remaining fuel : " + fuelLevel);

        return distance;



        return 10.9;
    }
}