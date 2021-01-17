public class A {
    public int sum(int a, int b) {
        return a + b;
    }

    // Overload method;
    public long sum(int a, long b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public float sum(float a) {
        return a + 10;
    }

    public static void main(String[] args) {
        A print = new A();
        double a = print.sum(5, 5);
        System.out.println(a);

        double b = print.sum(5, 15l);
        System.out.println(b);

        double c = print.sum(5, 20f);
        System.out.println(c);

        double e = print.sum(5);
        System.out.println(e);

    }
}
