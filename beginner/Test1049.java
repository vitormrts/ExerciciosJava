import java.io.IOException;
 
import java.util.Scanner;
public class Test1049 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();
        
        if ("vertebrado".equals(a)) {
            if ("ave".equals(b)) {
                if ("carnivoro".equals(c)) 
                    System.out.println("aguia");
                else
                    System.out.println("pomba");
            }
            else {
                if ("onivoro".equals(c))
                    System.out.println("homem");
                else 
                    System.out.println("vaca");
            }
                
        }
        
        else {
            if ("inseto".equals(b)) {
                if ("hematofago".equals(c))
                    System.out.println("pulga");
                else 
                    System.out.println("lagarta");             
            }
            else {
                if ("hematofago".equals(c))
                    System.out.println("sanguessuga");
                else 
                    System.out.println("minhoca");
            }
        }
 
    }
 
}