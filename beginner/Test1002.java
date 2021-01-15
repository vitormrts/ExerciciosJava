import java.io.IOException;
 
import java.util.Scanner;
public class Test1002 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();
        double pi = 3.14159;
        double area = pi * raio * raio;
        
        System.out.printf("A=%.4f%n", area);
 
    }
 
}