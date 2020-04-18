/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Teste {

    private static String cor(int identificador) {
        switch (identificador) {
            case 1:
                return "Verde";
            case 2:
                return "Amarelo";
            case 3:
                return "Azul";
            case 4:
                return "Branco";
                
            default:
                return "Identifcador inválido";
        }
            
    }
            
    public static void main(String[] args) {
        Random number = new Random();
        double randomweight = 1 + number.nextDouble()*(2.5-1);
        int random2 = 20 + number.nextInt(100) + 20;
        System.out.println(randomweight);
        System.out.println(random2);
    }
        
    
}
