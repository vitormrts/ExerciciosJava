/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio022;

/**
 *
 * @author Usuario
 */
public class Exercicio022 {

    static String copiaStr(String s) {
        String copia = "";
        for (int i = 0; i<s.length(); i++) {
            copia = copia + s.charAt(i);
        }
        System.out.println("a");
        return copia;
    }

    public static void main(String[] args) {
        copiaStr("asaaaaa");
        System.out.println("a");
    }
    
}
