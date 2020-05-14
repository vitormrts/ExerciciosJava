package exercicio020;




public class Exercicio020 {

    static boolean palindromo(String s) {
      
        String maiuscula = s.toUpperCase();
        String palindromo = "";
        
        for (int i = maiuscula.length()-1; i>=0; i--) {
            palindromo += maiuscula.charAt(i);           
        }
        
        if (maiuscula.equals(palindromo)) return true;
        
        return false;
    }
            
    public static void main(String[] args) {
        String palavra = "Osso";
        System.out.println(palindromo(palavra));
        
    }
    
}
