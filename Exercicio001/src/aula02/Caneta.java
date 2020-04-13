package aula02;
// this é o nome do objeto que chamou
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga +"%");
        System.out.println("Está tampada? " + this.tampada);
    }
    private void rabiscar() {
        if (this.tampada == true) {
            System.out.println("A caneta está tampada.");
        } else {
            System.out.println("Rabiscando...");
        }
        }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}
