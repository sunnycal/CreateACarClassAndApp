package com.company;

public class Car extends Vehicle {
//    Must make a default constructor so the car is accesible in your MAIN
    public Car() {
    }

    //Starting The car
    public String start(){
        return "The " + getColor()  + " "  +  getMake() + " " + getModel() + " is starting";
    }

    public String accelerate(){
        return "The " + getColor()  + " "  +  getMake() + " " + getModel() + " is accelerating";
    }

    public String speed(){
        return "The " + getColor()  + " "  +  getMake() + " " + getModel() + " is going " + getMpg() + " miles per hour.";
    }

    public String stop(){
        return "The " + getColor()  + " "  +  getMake() + " " + getModel() + " is stopped.";
    }
}







