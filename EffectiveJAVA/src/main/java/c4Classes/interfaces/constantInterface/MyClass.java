package c4Classes.interfaces.constantInterface;

// Pollutes hierarchy, also this is not the intended use of interfaces

interface Constants{
    int MAX_VALUE = 100;
    String DEFAULT_VALUE = "Default";
}

public class MyClass implements Constants{
    public static void main(String[] args) {
        System.out.println(MAX_VALUE);
        System.out.println(DEFAULT_VALUE);
    }
}
