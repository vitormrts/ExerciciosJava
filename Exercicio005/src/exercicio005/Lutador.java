package exercicio005;

public class Lutador implements UEC {
    // Atributos do lutador
    
    private String name;        // Nome
    private String nacionality; // Nacionalidade
    private int age;            // Idade
    private double height;      // Altura
    private double weight;      // Peso
    private String category;    // Categoria
    private int victories;      // Vitórias
    private int losses;         // Perdas
    private int ties;           // Empates

    // Método construtor
    
    public Lutador(String name, String nacionality,
            int age, double height,
            double weight, int victories,
            int losses, int ties) {
        this.name = name;
        this.nacionality = nacionality;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.victories = victories;
        this.losses = losses;
        this.ties = ties;
    }
    // Métodos Getters
    public String getName() {
        return name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getCategory() {
        return category;
    }

    public int getVictories() {
        return victories;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }
    
    // Métodos Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.setCategory();
    }

    private void setCategory() {
        if (this.getWeight() < 52.2) this.category = "Inválido";
        
        else if (this.getWeight()<= 70.3) this.category = "Leve";
        
        else if (this.getWeight()<= 83.9) this.category = "Médio";
        
        else if (this.getWeight() <= 120.2) this.category = "Pesado";
        
        else this.category = "Inválido";
        
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }
    
    // Métodos abstratos
    
    @Override
    public void apresentar() {
        System.out.println("Lutador: " + this.getName());
        System.out.println("Nacionalidade: " + this.getNacionality());
        System.out.println("Idade: " + this.getAge());
        System.out.println("Altura: " + this.getHeight()+"m");
        System.out.println("Peso: " + this.getWeight() +"Kg");
        System.out.println("Categoria: " + this.getCategory());
        System.out.println("Vitórias: " + this.getVictories());
        System.out.println("Derrotas: " + this.getLosses());
        System.out.println("Empates: " + this.getTies());
    }

    @Override
    public void status() {
        System.out.println(this.getName());
        System.out.println("É um peso " + this.getCategory());
        System.out.println(this.getVictories() + " vitórias");
        System.out.println(this.getLosses() + " derrotas");
        System.out.println(this.getTies() + " empates");
    }

    @Override
    public void ganharLuta() {
        this.setVictories(getVictories()+1);
    }

    @Override
    public void perderLuta() {
        this.setLosses(getLosses()+1);
    }

    @Override
    public void empatarLuta() {
        this.setTies(getTies()+1);
    }
}
