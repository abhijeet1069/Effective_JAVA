package c4Classes.interfaces.staticImports;

//Better approach than constant interfaces

import static c4Classes.interfaces.staticImports.Constants.DEFAULT_NAME;
import static c4Classes.interfaces.staticImports.Constants.MAX_VALUE;

class Constants{
    public static final int MAX_VALUE = 100;
    public static final String DEFAULT_NAME = "Default";
}

public class MyClass {
    public static void main(String[] args) {
        System.out.println(MAX_VALUE);
        System.out.println(DEFAULT_NAME);
    }
}
