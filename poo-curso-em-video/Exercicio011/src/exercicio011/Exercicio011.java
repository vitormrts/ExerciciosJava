/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio011;

/**
 *
 * @author Usuario
 */
public class Exercicio011 {

    static int contaCaracteres(String palavras[]) {
        int caracteres = 0;
        for (String palavra: palavras)
            caracteres += palavra.length();              
        
        return caracteres;
    }
    
    public static void main(String[] args) {
        String palavraslista[] = {"Vitor", "Ana"};
        System.out.println(contaCaracteres(palavraslista));
        
        
        
    }
    
}
