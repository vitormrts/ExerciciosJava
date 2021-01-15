import java.io.IOException;
 
import java.util.Scanner;
public class Test1067 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) System.out.println(i);
        }
 
    }
 
}