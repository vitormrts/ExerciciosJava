import java.io.IOException;
 
import java.util.Scanner;
public class Test1052 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int mes = input.nextInt();
        
        String meses[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 1; i<=meses.length; i++) {
            if (mes == i) System.out.println(meses[i-1]);
        }
 
    }
 
}