package c2Objects.staticFactoryMethods;

abstract class Shape{
    int area;
}

class Circle extends Shape{

}

class Square extends Shape{

}

public class ShapeFactory {
    public static Shape createShape(String type){
        if("circle".equalsIgnoreCase(type))
            return new Circle();
        else if("square".equalsIgnoreCase(type))
            return new Square();
        else
            throw new IllegalArgumentException("Unknown shape type: " + type);
    }

    public static void main(String[] args) {
        createShape("circle");
        createShape("pentagon");

    }
}
