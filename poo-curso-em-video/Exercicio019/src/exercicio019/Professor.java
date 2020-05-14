
package exercicio019;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void receberAum(double aumento) {
        this.salario += aumento;
    }
}
