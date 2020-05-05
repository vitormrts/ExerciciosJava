/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio015;

/**
 *
 * @author Usuario
 */
public class Exercicio015 {

    static int somaDiagonal(int[][] m) {
        int soma = 0;
        for (int i = 0; i<m.length; i++) {
            soma += m[i][i];
        }
        
        return soma;
    }
    public static void main(String[] args) {
        int matriz[][] = {{3, 2, 1}, {4, 1, 3}, {3, 2, 1}};
        System.out.println(somaDiagonal(matriz));
    }
    
}
