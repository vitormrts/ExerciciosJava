/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio025;

/**
 *
 * @author Usuario
 */
public class Pessoa {
    String nome;
    int idade;
    Pessoa conjuge;

    public Pessoa(String nome, int idadeEmAnos) {
        this.nome = nome;
        this.idade = idadeEmAnos;
        conjuge = null;
    }
    
    public Pessoa(String nome, int idade, Pessoa conjuge) {
        this(nome, idade);
        this.conjuge = conjuge;
    }
}
