import java.io.IOException;
 
import java.util.Scanner;
public class Test1070 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        
        for (int i = 0; i < 11; i += 2) {
            if (num % 2 == 1) System.out.println(num+2+i);
            else System.out.println(num+1+i);
        }
    }
 
}