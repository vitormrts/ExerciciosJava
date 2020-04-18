
package aula02exercicio;

public class Notebook {
    String modelo;
    boolean ligado;
    boolean carregando;
    int bateria;
    boolean aberto;

    public Notebook(String modelo, boolean ligado, boolean carregando, int bateria, boolean aberto) {
        this.modelo = modelo;
        this.ligado = ligado;
        this.carregando = carregando;
        this.bateria = bateria;
        this.aberto = aberto;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isCarregando() {
        return carregando;
    }

    public int getBateria() {
        return bateria;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setCarregando(boolean carregando) {
        this.carregando = carregando;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    
    public void abrir() {
        if (this.isAberto()) System.out.println("Notebook já estava aberto.");
        else System.out.println("Notebook foi aberto.");
    }
    
    public void carregar() {
        if (this.isCarregando()) System.out.println("Notebook já estava carregando.");
        else System.out.println("Notebook carregando.");
    }
    
    public void ligar() {
        if (this.isLigado()) System.out.println("Notebook já está ligado.");
        else System.out.println("Notebook foi ligado.");
    }
    
    public void desligar() {
        if (this.ligado) System.out.println("Notebook foi ligado. ");
        else System.out.println("Notebook já estava ligado.");
    }         
            
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Está ligado? " + this.ligado);
        System.out.println("Está carregando? " + this.carregando);
        System.out.println("Bateria: " + this.bateria);
        System.out.println("Está aberto? " + this.aberto);
    }
    
    
}
