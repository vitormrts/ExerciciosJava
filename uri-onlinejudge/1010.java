import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int cp1 = input.nextInt();
        int np1 = input.nextInt();
        double vp1 = input.nextDouble();
        
        int cp2 = input.nextInt();
        int np2 = input.nextInt();
        double vp2 = input.nextDouble();
        
        double valorf = vp2 * np2 + vp1 * np1;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorf);
    }
 
}