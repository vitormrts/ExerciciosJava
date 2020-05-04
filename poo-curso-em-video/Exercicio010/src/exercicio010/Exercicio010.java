/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio010;

/**
 *
 * @author Usuario
 */
public class Exercicio010 {

    static void somaPolinomios(double px[], double qx[]) {
        double rx[] = new double[px.length]; 
        
        for (int i = 0; i<px.length; i++) {
            rx[i] = px[i] + qx[i];
            
            System.out.print(" " + rx[i]);
            
            if (i != 0) System.out.print("x^"+i);
            if (i != px.length - 1) System.out.print(" +");       
        }       
    }
    
    public static void main(String[] args) {
        double px[] = {2, 4, 6, 3};
        double qx[] = {1, 2, 1, 1};
        
        somaPolinomios(px, qx);
    }
    
}
