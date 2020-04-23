import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input = new Scanner(System.in);
            int codigo = input.nextInt();
            int qntd = input.nextInt();
            double valor = 0;
            
            switch (codigo) {
                case 1:
                {
                    valor = qntd * 4;
                    break;
                }
                case 2:
                {
                    valor = qntd * 4.5;
                    break;
                }
                
                case 3:
                {    
                    valor = qntd * 5;
                    break;
                }
                
                case 4:
                {
                    valor = qntd * 2;
                    break;
                }
                    
                case 5:
                {
                    valor = qntd * 1.5;
                    break;
                }                           
            }
            
            System.out.printf("Total: R$ %.2f%n", valor);
 
    }
 
}