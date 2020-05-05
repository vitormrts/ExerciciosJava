/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio013;

/**
 *
 * @author Usuario
 */
public class Exercicio013 {

    static void soma3 (int m1[][], int m2[][], int m3[][]) {
        
        if (m1.length == m2.length && m2.length == m3.length) {
            
            for (int i = 0; i<m1.length; i++) {
                
                if (m1[i].length == m2[i].length && m2[i].length == m3[i].length) {
                    
                    for (int j = 0; j<m1[i].length; j++) {
                        
                    m1[i][j] = m1[i][j] + m2[i][j] + m3[i][j];
                    System.out.print(m1[i][j]+ " ");                                  
                    }                      
                }
                else {
                    m1 = null;
                    System.out.println(m1);
                    break;
                }
                System.out.println();            
            }       
        }
        else {
            m1 = null;
            System.out.println(m1);            
        }
    }
    public static void main(String[] args) {
        int m1[][] = {{3, 2, 1}, {1, 2, 3, 7}};
        int m2[][] = {{1, 5, 2}, {5, 7, 3}};
        int m3[][] = {{9, 1, 7}, {2, 6, 5}};
        soma3(m1, m2, m3);
    }
    
}
