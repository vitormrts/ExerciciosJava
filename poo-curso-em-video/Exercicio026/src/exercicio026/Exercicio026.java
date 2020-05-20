/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio026;

/**
 *
 * @author Usuario
 */
public class Exercicio026 {

    static Pessoa buscaPessoa(Pessoa[] pessoas, String nome, int idade) {
        for (Pessoa pessoa: pessoas) 
        {
            if (pessoa.getNome().equals(nome) && pessoa.getIdade() == idade) return pessoa; 
        }
        
        return null;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vitor", 18);
        Pessoa p2 = new Pessoa("Pedro", 23);
        Pessoa p3 = new Pessoa("Cléber", 54);
        Pessoa p4 = new Pessoa("Maria", 45);
        
        Pessoa lista[] = {p1, p2, p3, p4};
        System.out.println(buscaPessoa(lista, "Vitor", 18));
    }
    
}
