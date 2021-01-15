import java.io.IOException;
 
import java.util.Scanner;
public class Test1020 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        int dias = input.nextInt();
        int lst[] = {365, 30};
        int res[] = new int[2];
        for (int c = 0; c<lst.length; c++) {
            res[c] = dias / lst[c];
            dias = dias % lst[c];
        }
        
        System.out.println(res[0] + " ano(s)");
        System.out.println(res[1] + " mes(es)");
        System.out.println(dias + " dia(s)");
 
    }
 
}