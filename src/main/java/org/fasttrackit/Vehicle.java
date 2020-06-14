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

        if(speed > maxSpeed) {
            System.out.println(("Max speed exceeded.");
            return 0;

} else if (speed ==maxSpeed) {
            System.out.println("Careful! Max speed reached!");
        } else {
            System.out.println("Valid speed entered.");
        }


        if(damaged)
            System.out.println(("The vehicle is damaged. You cannot accelerate.);
                    return 0;

        }


// Dacia is accelerating with 60 km/h for 1 h
        System.out.println(make + " is acelerating with " + speed + "km/h for" + durationInHours + "h");

        double distance = speed * durationInHours;
        totalTravelDistance = totalTravelDistance + distance;


                //same result as the statment above;
        // totalTravelDistance += distance;

        System.out.println("Total traveled distance: ");


        double usedFuel  = distance * mileage / 100;

        //todo: use more fuel if speed > 120 km/h

        fuelLevel = fuelLevel - usedFuel;
      //  fuelLevel-= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;




    }
}