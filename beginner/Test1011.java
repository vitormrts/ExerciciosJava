import java.io.IOException;
 
import java.util.Scanner;
public class Test1011 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double pi = 3.14159;
        double volume = (4.0/3)*pi*r*r*r;
        System.out.printf("VOLUME = %.3f%n", volume);
    }
 
}