public class Triangulo extends Forma {

    private double a;
    private double b;
    private double c;

    public Triangulo() {}

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double calcularArea(){
        double p = (a + b + c) / 2.0;
        this.setArea(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        return this.getArea();
    }


}
