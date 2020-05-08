import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        int pares = 0;
        
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num % 2 == 0) pares ++;
        }
        
        System.out.println(pares + " valores pares");  
 
    }
 
}