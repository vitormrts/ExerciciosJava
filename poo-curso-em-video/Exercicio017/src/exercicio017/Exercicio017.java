/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio017;

/**
 *
 * @author Usuario
 */
public class Exercicio017 {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2]; // Cria 3 posições da classe Pessoa
        Livro l[] = new Livro[3]; // Criar 3 posições da classe Livro
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java avançado", "Maria Cândido", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avançarPag();
        
        System.out.println(l[0].detalhes());
        
    }
    
}
