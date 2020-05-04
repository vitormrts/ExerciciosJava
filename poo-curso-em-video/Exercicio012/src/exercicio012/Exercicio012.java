/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio012;

/**
 *
 * @author Usuario
 */
public class Exercicio012 {

    static int contaCaracteres(char palavras[][]) {
        int total = 0;
        /*for (int i = 0; i<palavras.length; i++) {
            
            total += palavras[i].length;
        }*/
        for (char palavra[]:palavras) {
            total += palavra.length;
    }
        return total;
    }
    public static void main(String[] args) {
        char palavras[][] = {
            {'B', 'a', 'n', 'a', 'n', 'a'},
            {'M', 'a', 'ç', 'ã'},
            {'P', 'ê', 'r', 'a'},
            {'A', 'b', 'a', 'c', 'a', 't', 'e'}
        };
        
        System.out.println(contaCaracteres(palavras));
    }
    
}
