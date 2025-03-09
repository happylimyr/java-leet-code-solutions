package easy;

public class SqrtX {

    public int mySqrt(int x) {
        // return (int) Math.sqrt(x); XD
        double half = x / 2;
        double num = 0;
        while (num - half != 0) {
            num = half;
            half = (num + (x / num)) / 2;
        }

        return (int) half;
    }

}
