import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;  // 6.5  7.8 9.10

        System.out.println("Digite as medidas do triangulo X: ");
        xA = entrada.nextDouble();
        xB = entrada.nextDouble();
        xC = entrada.nextDouble();

        System.out.println("Digite as medidas do triangulo Y: ");
        yA = entrada.nextDouble();
        yB = entrada.nextDouble();
        yC = entrada.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        System.out.printf("Triangulo X área: %.4f%n", areaX);

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        System.out.printf("Triangulo Y área: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }


    }
}
