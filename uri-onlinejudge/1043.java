import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        
        if ((a+b > c) && (b+c > a) && (c + a > b)) {
            double perimetro = a+b+c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        }
        else {
            double area = (a+b)*c/2;
            System.out.printf("Area = %.1f%n", area);
        }
 
    }
 
}