package c2Objects.dependencyInjection.constructorInjection;

class Engine{
    public void start(){
        System.out.println("Engine started");
    }
}

class Car{
    private final Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine); //Here, engine is loosely coupled to car. I can switch with any other object too.
        car.drive();
    }
}
