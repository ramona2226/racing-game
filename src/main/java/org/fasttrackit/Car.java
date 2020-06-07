package org.fasttrackit;


// "is-a" relationship (inheritans)
public class Car  extends AutoVehicle {



    // instance variable
    String model ;
    String make;
    String color;
    double mileage;
    double fuelLevel;
    double maxSpeed;
    double totalTravelDistance;
    boolean damaged;


    //has-a relationship (relatia de agregare/Aggregation)
    Engine engine;




}
