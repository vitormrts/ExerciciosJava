package exercicio009;

public class Exercicio009 {

    public static void main(String[] args) {
        Disputas d1 = new Disputas();
        
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem();
        
        p1.generate();
        p2.generate();
        
        p1.apresentar();
        p2.apresentar();
        
        p1.status();
        p2.status();
        
        d1.startdispute(p1, p2);
        d1.chess();
        d1.dodge();
        d1.ironarm();
        d1.race();
        d1.finaldispute();
        
        p1.status();
        p2.status();
        
    }
    
}
