package c2Objects.avoidUnnecessaryObjects;

class Example {
    static int sharedValue = 42; // Static field

    int instanceValue; // Instance field

    public Example(int instanceValue) {
        this.instanceValue = instanceValue;
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj1 = new Example(1);
        Example obj2 = new Example(2);

        // Both objects share the same static field
        System.out.println(Example.sharedValue); // 42
        System.out.println(obj1.sharedValue); // 42
        System.out.println(obj2.sharedValue); // 42

        // Each object has its own instance field
        System.out.println(obj1.instanceValue); // 1
        System.out.println(obj2.instanceValue); // 2
    }
}
