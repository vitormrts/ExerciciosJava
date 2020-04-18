
package aula02exercicio;

public class Aula02Exercicio {

    public static void main(String[] args) {
        Notebook n1 = new Notebook("Asus", false, false, 100, false);
        /*
        
        n1.modelo = "Asus";
        n1.ligado = false;
        n1.carregando = false;
        n1.bateria = 100;
        n1.aberto = false;
        
        */
        
        n1.abrir();
        n1.carregar();
        n1.ligar();
        n1.status();
                
    }
    
}
