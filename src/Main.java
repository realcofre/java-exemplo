import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

//        double xA, xB, xC, yA, yB, yC;  // 6.5  7.8 9.10
//
//        System.out.println("Digite as medidas do triangulo X: ");
//        xA = entrada.nextDouble();
//        xB = entrada.nextDouble();
//        xC = entrada.nextDouble();
//
//        System.out.println("Digite as medidas do triangulo Y: ");
//        yA = entrada.nextDouble();
//        yB = entrada.nextDouble();
//        yC = entrada.nextDouble();
//
//        double p = (xA + xB + xC) / 2.0;
//        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
//        System.out.printf("Triangulo X área: %.4f%n", areaX);
//
//        p = (yA + yB + yC) / 2.0;
//        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
//        System.out.printf("Triangulo Y área: %.4f%n", areaY);
//
//        if (areaX > areaY) {
//            System.out.println("Maior área: X");
//        } else {
//            System.out.println("Maior área: Y");
//        }

        Triangulo trianguloX = new Triangulo();
        System.out.println("Digite as medidas do triangulo X: ");
        //xA = entrada.nextDouble();
        trianguloX.setA(entrada.nextDouble());
        trianguloX.setB(entrada.nextDouble());
        trianguloX.setC(entrada.nextDouble());
        //encapsulamento
        System.out.printf("Triangulo X área: %.4f%n", trianguloX.calcularArea());


        //Triangulo trianguloY = new Triangulo(7.8, 5.6, 9.2);
        Triangulo trianguloY = new Triangulo();
        System.out.println("Digite as medidas do triangulo Y: ");
        trianguloY.setA(entrada.nextDouble());
        trianguloY.setB(entrada.nextDouble());
        trianguloY.setC(entrada.nextDouble());
        System.out.printf("Triangulo Y área: %.4f%n", trianguloY.calcularArea());

        if (trianguloX.getArea() > trianguloY.getArea()) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }

    }
}
