package exercicio009;

import java.util.Random;

public class Personagem implements InterfacePersonagem{
    private double height;
    private int weight;
    private String breed;
    private int force;
    private int speed;
    private int intelligence;
    private int dexterity;
    private int victories;
    private int losses;
    private int ties;
    private int games;

    public int getVictories() {
        return victories;
    }
    
    public int getGames() {
        return games;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }
        
    private double getHeight() {
        return height;
    }

    private int getWeight() {
        return weight;
    }

    private String getBreed() {
        return breed;
    }

    public int getForce() {
        return force;
    }

    public int getSpeed() {
        return speed;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    private void setBreed() {
        Random random = new Random();
        
        int r = random.nextInt(3);
        
        switch (r) {
            case 1:
                this.breed = "Minotauro";
                this.setForce(5);
                this.setIntelligence(3);
                this.setDexterity(1);
                break;
            case 2:
                this.breed = "Humano";
                this.setForce(1);
                this.setIntelligence(3);
                this.setDexterity(5);
                
                break;
            case 3:
                this.breed = "Elfo";
                this.setForce(1);
                this.setIntelligence(5);
                this.setDexterity(3);
                break;
        }
    }
    
    private void setHeight() {
        Random number = new Random();      
        
        switch (this.getBreed()) {
            case "Minotauro":
                {
                    double randomheight = 1.8 + number.nextDouble() * (2.5-1.8);
                    this.height = randomheight;
                    break;
                }
            case "Humano":
                {
                    double randomheight = 1.5 + number.nextDouble() * (2-1.5);
                    this.height = randomheight;
                    break;
                }
            default:
                {
                    double randomheight = 1.0 + number.nextDouble() * (1.6-1);
                    this.height = randomheight;
                    break;
                }
                
        }
          
        if (this.height <= 1.6) {
            this.setForce(this.getForce()+1);
            this.setSpeed(this.getSpeed()+3);
        } 
        else if (this.height <= 2) {
            this.setForce(this.getForce() + 2);
            this.setSpeed(this.getSpeed() + 2);
        }
        else {
            this.setForce(this.getForce() + 3);
            this.setSpeed(this.getSpeed() + 1);
        }       
    }

    private void setWeight() {
        Random number = new Random();
        

        switch (this.getBreed()) {
            case "Minotauro": 
                {
                int randomweight = 90 + number.nextInt(40);
                this.weight = randomweight;
                break;               
                }
                
            case "Humano": 
                {
                int randomweight = 40 + number.nextInt(90);
                this.weight = randomweight;
                break;
                }
            default:
            {
                int randomweight = 30 + number.nextInt(50);
                this.weight = randomweight;
                break;
            }
        }
        

        
        if (this.weight <= 70) {
            this.setSpeed(3);
            this.setForce(1);
        }
        else if (this.weight <= 120) {
            this.setSpeed(2);
            this.setForce(2);
        }
        else {
            this.setSpeed(1);
            this.setForce(3);
        }
    }

    private void setForce(int force) {
        this.force = force;
    }

    private void setSpeed(int speed) {
        this.speed = speed;      
    }

    private void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    private void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }  
    
    public void setVictories() {
        Random number = new Random();
        int win = number.nextInt(5);
        this.victories = win;
    }

    public void setLosses() {
        Random number = new Random();
        int loss = number.nextInt(5);
        this.losses = loss;
    }

    public void setTies() {
        Random number = new Random();
        int tie = number.nextInt(5);
        this.ties = tie;
    }
    
    public void setGames() {
        this.games = this.getVictories() + this.getLosses() + this.getTies();
    } 
    
    
    
    
    @Override
    public void apresentar() {
        System.out.println("==================");
        System.out.println("STATUS");
        System.out.println("==================");
        System.out.println("Raça: " + this.getBreed());
        System.out.printf("Altura: %.2fm\n", this.getHeight());
        System.out.println("Peso: " + this.getWeight() + "Kg");
    }
    
    @Override
    public void status() {
        System.out.println("==================");
        System.out.println("Com um total de " + this.getGames() + " jogos...");
        System.out.println("Vitórias: " + this.getVictories());
        System.out.println("Derrotas: " + this.getLosses());
        System.out.println("Empates: " + this.getTies());
    }
    
    @Override
    public void generate() {       
        this.setBreed();
        this.setHeight();
        this.setWeight();
        
        this.setVictories();
        this.setLosses();
        this.setTies();
        this.setGames();
    }
    
    public void windispute() {
        this.victories += 1;
    }
    
    public void losedispute(){
        this.losses += 1;
    }
    
    public void tiedispute() {
        this.ties += 1;
    }


    
}
