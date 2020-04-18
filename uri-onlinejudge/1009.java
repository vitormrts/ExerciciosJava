import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double sal = input.nextDouble();
        double vendas = input.nextDouble();
        double comissao = vendas * 0.15;
        double tot = comissao + sal;
        System.out.printf("TOTAL = R$ %.2f%n", tot);
 
    }
 
}