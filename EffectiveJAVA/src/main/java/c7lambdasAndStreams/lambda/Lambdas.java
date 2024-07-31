package c7lambdasAndStreams.lambda;

public class Lambdas {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        //myCat.print();
        //printThing(myCat);
//        printThing(
//                ()-> System.out.println("Hello")
//        );
    }

    static void printThing(Printable thing){
        thing.print();
    }
}
