/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio016;

/**
 *
 * @author Usuario
 */
public class Exercicio016 {

    static boolean simetrica(int[][] m) {
        boolean ok = false;
        for (int i = 0; i<m.length; i++) {
            for (int j = 0; j<m.length; j++) {
                if (m[i][j] == m[j][i]) {
                    ok = true;
                }
                else {
                    return false;
                }
            }
            
        }
        return ok;
    }

    public static void main(String[] args) {
        int matriz[][] = {{2, 1, -1}, {1, 3, 0}, {-2, 0, 5}};
        System.out.println(simetrica(matriz));
    }
    
}
