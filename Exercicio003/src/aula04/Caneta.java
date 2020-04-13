package aula04;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getPonta() {
        return ponta;
    }

    public boolean isTampada() {
        return tampada;
    }
    
    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada: "+ this.isTampada());
    }
    
}
