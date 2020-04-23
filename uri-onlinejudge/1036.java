import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double delta = b*b - 4*a*c;
        if (delta<0 || a==0) {
            System.out.println("Impossivel calcular");
        }
        else {
            double r1 = (-1*b + Math.sqrt(delta))/(2*a);
            double r2 = (-1*b - Math.sqrt(delta))/(2*a);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }

 
    }
 
}