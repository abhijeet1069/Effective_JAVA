package c5Generics.postGenerics;

public class Pair<At,Bt> {

    private final At first;
    private final Bt second;

    public Pair(At first, Bt second) {
        this.first = first;
        this.second = second;
    }

    public At getFirst() {
        return first;
    }
    public Bt getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first + " , "+
                "second=" + second +
                '}';
    }
}
