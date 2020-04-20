import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int maior = (a+b+Math.abs(a-b))/2;
        if (c>maior) maior = c;
        System.out.println(maior + " eh o maior");
 
    }
 
}