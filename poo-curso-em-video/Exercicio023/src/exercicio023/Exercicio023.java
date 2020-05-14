/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio023;

/**
 *
 * @author Usuario
 */
public class Exercicio023 {

        static String copiaStr(String s) {
            String copia = "";
            for (int i = 0; i<s.length(); i++) {
                copia = copia + s.charAt(i);
            }   
            return copia;
        }
    public static void main(String[] args) {
        System.out.println(copiaStr("Vitor"));
    }
    
}
