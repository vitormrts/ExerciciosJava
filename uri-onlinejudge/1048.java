import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        double salario = input.nextDouble();
        double ajuste = 0;
        
        if (salario > 0 && salario < 400.01) {
            ajuste = 15;         
        }
        else if (salario >= 400.01 && salario < 800.01) {
            ajuste = 12;
        }
        else if (salario >= 800.01 && salario < 1200.01) {
            ajuste = 10;
        }
        else if (salario >= 1200.01 && salario <= 2000.00) {
            ajuste = 7;          
        }
        else {
            ajuste = 4;
        }
        double reajuste = salario * (ajuste/100);
        salario += reajuste;
        
        System.out.printf("Novo salario: %.2f%n", salario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %.0f %%%n", ajuste, " %");
    }
 
}