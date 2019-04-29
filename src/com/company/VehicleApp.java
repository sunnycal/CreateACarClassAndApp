/*
* create car class
* inherit from vehicle class
* class should contain:
* a. private member variables b. a default constructor c. an overloaded constructor
*
d. methods which return a string indicating each task the car is performing.
* */

package com.company;

public class VehicleApp {
    public static void main(String[] args) {
        carClassApp();
    }

    public static void carClassApp() {

//        Make a car
        Car v1 = new Car();

//        Set its Attributes
        v1.setColor("red");
        v1.setMake("Porsche");
        v1.setModel("Carrera");
        v1.setMpg(50);

//        Start the car its function/method is in Car.java
        System.out.println(v1.start());
        System.out.println(v1.accelerate());
        System.out.println(v1.speed());
        System.out.println(v1.stop());

    }

}
