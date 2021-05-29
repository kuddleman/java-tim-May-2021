package section6oopPart1;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(ComplexNumber c) {
        double cReal = c.getReal();
        double cImg = c.getImaginary();

        this.real += cReal;
        this.imaginary += cImg;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber c) {
        double cReal = c.getReal();
        double cImg = c.getImaginary();

        this.real -= cReal;
        this.imaginary -= cImg;
    }
}
