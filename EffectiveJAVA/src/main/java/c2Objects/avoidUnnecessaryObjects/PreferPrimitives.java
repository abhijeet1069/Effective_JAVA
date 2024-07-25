package c2Objects.avoidUnnecessaryObjects;

public class PreferPrimitives {

    public long sum(){
        //Long can lead to longer time.
        long sum = 0L;
        for(long i = 0;i < Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }
}
