public class calculator {
    int a, b;
    double c, d;

    public calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public calculator(double c, double d) {
        this.c = c;
        this.d = d;
    }

    public int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    public double sum(double a, double b) {
        double s = a + b;
        return s;
    }
}
