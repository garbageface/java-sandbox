public class Larger {
    public static int LargerDemo(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(LargerDemo(-5,10));
    }
}
// what