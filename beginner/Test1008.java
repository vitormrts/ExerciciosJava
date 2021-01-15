import java.io.IOException;
import java.util.Scanner;
public class Test1008 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int horas = input.nextInt();
        double valor = input.nextDouble();
        double salario = horas * valor;
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n", salario);
 
    }
 
}