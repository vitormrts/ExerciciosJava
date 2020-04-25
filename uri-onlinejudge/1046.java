import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int inicio = input.nextInt();
        int fim = input.nextInt();
        
        int tempo = 0;
        
        if (fim - inicio == 0) tempo = 24;
        if (fim > inicio) tempo = fim - inicio;
        if (fim < inicio) tempo = 24 - inicio + fim;
        
        
        System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
 
    }
 
}