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
        float n1 = input.nextFloat()*2;
        float n2 = input.nextFloat()*3;
        float n3 = input.nextFloat()*4;
        float n4 = input.nextFloat();
            
        float media = (n1+n2+n3+n4)/10;
            
        System.out.printf("Media: %.1f%n", media);
            
            
            
        if (media>=7) System.out.println("Aluno aprovado.");
        else if (media<5) System.out.println("Aluno reprovado.");
        else {
            System.out.println("Aluno em exame.");
            float exame = input.nextFloat();
            media = (media+exame)/2;
            System.out.printf("Nota do exame: %.1f%n", exame);
            if (media>=5) System.out.println("Aluno aprovado.");
            else System.out.println("Aluno reprovado.");
            System.out.printf("Media final: %.1f%n", media);
        }
 
    }
 
}