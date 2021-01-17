public class B extends A{
    @Override
    public int sum(int a, int b) {
        return a + b + 10;
    }

    @Override
    public long sum(int a, long b) {
        return super.sum(a, b);
    }

    @Override
    public float sum(float a, float b) {
        return super.sum(a, b);
    }

    @Override
    public float sum(float a) {
        System.out.println(super.sum(a));
        return a + 20;
    }

    public static void main(String[] args) {
        B sub = new B();

        System.out.println(sub.sum(5f));

        A sup = new A();
        System.out.println(sub.sum(5f));

    }
}
