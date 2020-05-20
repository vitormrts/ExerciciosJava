/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio024;

/**
 *
 * @author Usuario
 */
public class Exercicio024 {

    static boolean comparaTextos(String texto1, char[] texto2) {
        boolean status = false;
        String palavra1 = "";
        String palavra2 = "";
        
        for (int i=0; i<texto1.length(); i++) palavra1 += texto1.charAt(i);
        
        for (int i=0; i<texto2.length; i++) palavra2 += texto2[i];
        
        if (palavra1.equals(palavra2)) status = true;
        return status;
    }

    public static void main(String[] args) {
        String texto1 = "Teste";
        char texto2[] = {'T', 'e', 's', 't', 'e'};
        
        System.out.println(comparaTextos(texto1, texto2));
        
    }
    
}
