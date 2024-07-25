class Hello{
    static String msg = "Hello";
}

public class App {
    public static void main(String[] args) {
        Hello obj1 = new Hello();
        Hello obj2 = new Hello();

        obj1.msg = "Bye";
        System.out.println(obj2.msg);
    }
}
