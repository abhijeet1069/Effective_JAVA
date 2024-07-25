package c4Classes.composition;

interface EngineBehavior{
    void startEngine();
}

class CarEngine implements EngineBehavior{
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
}

class Vehicle{
    private EngineBehavior engineBehavior;

    public Vehicle(EngineBehavior engineBehavior){
        this.engineBehavior = engineBehavior;
    }

    void startEngine(){
        engineBehavior.startEngine();
    }
}

public class Main {
    public static void main(String[] args) {
        EngineBehavior carEngine = new CarEngine();
        Vehicle car = new Vehicle(carEngine);
        car.startEngine();
    }
}
