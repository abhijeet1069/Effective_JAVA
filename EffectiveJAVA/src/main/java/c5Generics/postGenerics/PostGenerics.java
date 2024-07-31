package c5Generics.postGenerics;

public class PostGenerics {
    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>(2,"3");
        System.out.println(pair);
    }
}
