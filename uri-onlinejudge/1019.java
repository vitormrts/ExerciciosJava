import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        int segundos = input.nextInt();
        int lst[] = {3600, 60, 1};
        int res[] = new int[3];
        for (int c=0; c<lst.length; c++){
            res[c] = segundos / lst[c];
            segundos = segundos % lst[c];
        }
        
        System.out.println(res[0]+":"+res[1]+":"+res[2]);
 
    }
 
}