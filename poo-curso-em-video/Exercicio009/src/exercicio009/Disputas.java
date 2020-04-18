package exercicio009;
    
public class Disputas {
    private Personagem challenger;
    private Personagem challenged;
    private int winchallenger;
    private int winchallenged;
    
    public void startdispute(Personagem p1, Personagem p2) {
        this.challenger = p1;
        this.challenged = p2;
        System.out.println("==================");
        System.out.println("O primeiro jogador desafia o segundo jogador!");
    }
    
    public void chess() {
        System.out.println("==================");
        System.out.println("XADREZ");
        
        if (this.challenger.getIntelligence() > this.challenged.getIntelligence()) {
            
            this.winchallenger += 1;
                        
            System.out.println("Vencedor: Desafiante");
            System.out.println("Perdedor: Desafiado");
        }
        else if (this.challenger.getIntelligence() < this.challenged.getIntelligence()) {
            this.winchallenged += 1;
            
            System.out.println("Vencedor: Desafiado");
            System.out.println("Perdedor: Desafiante");
        }
        else {                      
            System.out.println("EMPATE !!!");
        }
    }
    
    public void dodge() {
        System.out.println("==================");
        System.out.println("DESVIAR DO OBJETO");
        if (this.challenger.getDexterity() > this.challenged.getDexterity()) {
            this.winchallenger += 1;
                       
            System.out.println("Vencedor: Desafiante");
            System.out.println("Perdedor: Desafiado");
        }
        else if (this.challenger.getDexterity() < this.challenged.getDexterity()) {
            this.winchallenged += 1;
            
            System.out.println("Vencedor: Desafiado");
            System.out.println("Perdedor: Desafiante");
        }
        else {            
            System.out.println("EMPATE !!!");
        }
    }
    
    public void ironarm() {
        System.out.println("==================");
        System.out.println("BRAÇO DE FERRO");
        if (this.challenger.getForce() > this.challenged.getForce()) {
            this.winchallenger += 1;
           
            System.out.println("Vencedor: Desafiante");
            System.out.println("Perdedor: Desafiado");
        }
        else if (this.challenged.getForce() < this.challenged.getForce()) {
            this.winchallenged += 1;
            
            System.out.println("Vencedor: Desafiado");
            System.out.println("Perdedor: Desafiante");
            
        }
        else {       
            System.out.println("EMPATE !!!");
        }
    }
    
    public void race(){
        System.out.println("==================");
        System.out.println("CORRIDA");

        
        if (this.challenger.getSpeed() > this.challenged.getSpeed()) {
            this.winchallenger += 1;
          
            System.out.println("Vencedor: Desafiante");
            System.out.println("Perdedor: Desafiado");
        }
        else if (this.challenger.getSpeed() < this.challenged.getSpeed()) {
            this.winchallenged += 1;
            
            System.out.println("Vencedor: Desafiado");
            System.out.println("Perdedor: Desafiante");
        }
        
        else {
           System.out.println("EMPATE !!!");
        }     
    }
    
    public void finaldispute() {
        System.out.println("==================");
        System.out.println("RESULTADO FINAL");
        System.out.println("Vitórias do Desafiante: " + winchallenger);
        System.out.println("Vitórias do Desafiado: " + winchallenged);
        if (this.winchallenger > this.winchallenged) {
            this.challenger.windispute();
            this.challenged.losedispute();
            System.out.println("VITÓRIA DO DESAFIANTE !!!");
        }
        else if (this.winchallenger < this.winchallenged) {
            this.challenger.losedispute();
            this.challenged.windispute();
            System.out.println("VITÓRIA DO DESAFIADO !!!");
        }
        else {
            this.challenged.tiedispute();
            this.challenger.tiedispute();
            System.out.println("TEMOS UM EMPATE !!!");
        }
        
        this.challenged.setGames();
        this.challenger.setGames();
    } 
}
