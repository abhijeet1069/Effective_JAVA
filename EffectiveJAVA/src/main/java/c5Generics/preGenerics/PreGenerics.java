package c5Generics.preGenerics;

import java.util.ArrayList;
import java.util.List;

public class PreGenerics {
    public static void main(String[] args) {
        List strings = new ArrayList();

        strings.add("Hello");
        strings.add(4); //causes class cast exception, during runtime

        String hello = (String) strings.get(0);
        String world = (String) strings.get(1);

        System.out.println(hello+" "+world);
    }
}
