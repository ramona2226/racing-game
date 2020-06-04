package org.fasttrackit;
// one-line comment added

public class App 
{
    public static void main( String [] args )
    {
        System.out.println(" Welcome to the Racing Game ! ");
         Car carReference = new Car () ;
        carReference.make = "Skoda";
        carReference.model = "Fabia";
        carReference. mileage = 7.5 ;
        carReference.fuelLevel = 60;
        carReference.color = "red";
        carReference.maxSpeed = 300;


        System.out.println(carReference.make);
        System.out.println(carReference.model);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.color);
        System.out.println(carReference.maxSpeed);
       System.out.println(carReference.totalTravelDistance);
        System.out.println(carReference.damaged);
        System.out.println(carReference.doorCount);


        Car car2 = new Car();
        car2.make = "Mercedes";
        car2.model = "CLS";
        car2.color = "black";


        // concatenation
        System.out.println(car2.make +" " + carReference.make);



        car2 =carReference;

        System.out.println(car2.make);
        System.out.println(carReference.make);


        car2.make = "Audi";

        System.out.println(car2.make);
        System.out.println(carReference.make);




    }
}

