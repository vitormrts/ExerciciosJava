/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio019;

/**
 *
 * @author Usuario
 */
public class Exercicio019 {


    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Vitor");
        p2.setNome("Pedro");
        p3.setNome("Adriano");
        p4.setNome("Joao");
        
        p2.setCurso("BCC");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
