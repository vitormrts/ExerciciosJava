import java.io.IOException;
import java.util.Scanner;
public class Test1012 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double triangulo = (a*c)/2;
        double pi = 3.14159;
        double circulo = pi * c * c;
        double trapezio = ((a+b)*c)/2;
        double quadrado = b*b;
        double ret = a*b;
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", ret);
 
    }
 
}