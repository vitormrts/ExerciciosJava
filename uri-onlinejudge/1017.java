import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        int tempo = input.nextInt();
        int kmh = input.nextInt();
        double tot = tempo * kmh;
        double litro = tot/12;
        System.out.printf("%.3f%n", litro);
 
    }
 
}