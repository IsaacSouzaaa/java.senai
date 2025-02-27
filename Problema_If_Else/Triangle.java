package Problema_If_Else;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String total(Triangle x, Triangle y) {

        String result;

        if (x.area() > y.area()) {
            result = "Larger area: X";
        } else {
            result = "Larger area: Y";
        }
        return result;
    }
}