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







        carReference.engine =  new Engine();
        carReference.engine.manufacturer =  "VW";
        carReference.engine.capacity = 1900;

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 1900;


        carReference.engine = engine1;



        carReference.accelerate(60, 1);





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

        double car2Distance = car2.accelerate(120, 3);


        Car car2Backup = car2;

        car2 = carReference;



        // concatenation
        System.out.println(car2.make +" " + carReference.make);



        car2 =carReference;

        System.out.println(car2.make);
        System.out.println(carReference.make);

        car2.make = "Audi";

        System.out.println("Updated name");
        System.out.println(car2.make);
       System.out.println(carReference.make);

//System.out.println("Modulo (modulus) exemples:");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//
//        System.out.println("Is 4 even?");
//        System.out.println(5 % 2 == 0);
 }
public void makeSound(Vehicle vehicle) {
   System.out.println("Repairing vehicle " + vehicle.make);
vehicle.totalTravelDistance -= 1000;
    vehicle.damaged = false;
}
}