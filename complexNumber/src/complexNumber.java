public class complexNumber {
    private final double real;
    private final double imaginary;

    public complexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public complexNumber sum(complexNumber a, complexNumber b) {
        double realPart = a.real + b.real;
        double imaginaryPart = a.imaginary + b.imaginary;

        return new complexNumber(realPart, imaginaryPart);
    }

    public complexNumber subtract(complexNumber a, complexNumber b) {
        double realPart = a.real - b.real;
        double imaginaryPart = a.imaginary - b.imaginary;

        return new complexNumber(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        if (imaginary == 0) {
            return real + "";
        }
        if (real == 0) {
            return imaginary + "i";
        }
        if (imaginary > 0) {
            return real + " + " + imaginary + "i";
        }
        return real + " - " + (-imaginary) + "i";
    }
}
