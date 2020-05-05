/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio014;

/**
 *
 * @author Usuario
 */
public class Exercicio014 {

    static int maiorValor(int[][] m) {
        int maior = m[0][0];
        
        for (int i = 0; i<m.length; i++) {
            for (int j = 0; j<m[i].length; j++)
            if (m[i][j]>maior) {
                maior = m[i][j];
            }
        }
        return maior;
    }
    public static void main(String[] args) {
        int matriz[][] = {{3, 2, 1, 10}, {5, 2, 1, 1, 9}, {7, 1}};
        System.out.println(maiorValor(matriz));
    }
    
}
