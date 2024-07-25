package c4Classes.inheritance;

//Prefer composition over inheritance

class Vehicle{
    void startEngine(){
        System.out.println("Engine started");
    }
}

class Car extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Car engine started");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
    }
}
