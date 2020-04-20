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
        
        int valor = input.nextInt();
        int valorr = valor;
        
        int notas[] = new int[7];
        int v[] = {100, 50, 20, 10, 5, 2, 1};
        for (int c = 0; c<notas.length; c++) {
            notas[c] = valor/v[c];
            valor = valor % v[c];
            
        }
        
        System.out.println(valorr);
        System.out.println(notas[0] + " nota(s) de R$ 100,00");
        System.out.println(notas[1] + " nota(s) de R$ 50,00");
        System.out.println(notas[2] + " nota(s) de R$ 20,00");
        System.out.println(notas[3] + " nota(s) de R$ 10,00");
        System.out.println(notas[4] + " nota(s) de R$ 5,00");
        System.out.println(notas[5] + " nota(s) de R$ 2,00");
        System.out.println(notas[6] + " nota(s) de R$ 1,00");
 
    }
 
}