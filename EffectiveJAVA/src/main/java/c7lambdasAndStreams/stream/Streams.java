package c7lambdasAndStreams.stream;

import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,8};

        //imperative approach
//        int sum = 0;
//        for(int i = 0; i < array.length; i++){
//            if(array[i]%2 == 0){
//                sum += array[i];
//            }
//        }

        //declarative approach
        int sum1 = Arrays.stream(array).filter(n->n%2 == 0).sum();
        System.out.println(sum1);
    }
}
