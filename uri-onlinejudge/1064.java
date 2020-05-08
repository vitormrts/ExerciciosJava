import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int cont = 0;
        double soma = 0;
        double media = 0;
        
        for (int i = 0; i<6; i++) {
            double num = input.nextDouble();            
            if (num>0) {
                soma += num;
                cont ++;
            }
        }
        
        media = soma/cont;
        
        System.out.println(cont + " valores positivos");  
        System.out.printf("%.1f%n", media);
 
    }
 
}