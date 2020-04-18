package exercicio005;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        
        if ((l1 != l2) && (l1.getCategory().equals(l2.getCategory()))) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
            System.out.println("A luta foi aprovada!");
        }        
        
        else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("A luta não foi aprovada.");
        }
    };
    
    public void lutar(Lutador l1, Lutador l2) {
        if (((this.aprovada) && l1.equals(this.getDesafiado()) && l2.equals(this.getDesafiante()))){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random random = new Random();
            
            int vencedor = random.nextInt(3); // Gera 3 resultados: 0, 1 ou 2
            switch(vencedor) {
                case 0:  
                    System.out.println("EMPATE!!!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                    
                case 1:
                    System.out.println("K.O!!!\n" + desafiante.getName() + " É O VENCEDOR.");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                    
                case 2:
                    System.out.println("K.O!!!\n" + desafiado.getName() + " É O VENCEDOR.");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
            }
        }
        else System.out.println("A luta não pode acontecer.");
    }
   
}
