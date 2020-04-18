package aula05;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    
    // Métodos
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta(String tipo) {
        
        if (tipo == "CC") {
            this.setSaldo(50);
            System.out.println("Conta aberta com sucesso!");
        } 
        else if (tipo == "CP"){           
                this.setSaldo(150);
                System.out.println("Conta aberta com sucesso!");
        }
        
        this.setTipo(tipo);
        this.setStatus(true);
    }
    
    public void fecharConta() {
        if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, pois está em débito.");
        } else 
            if (this.getSaldo() > 0){
                System.out.println("Conta não pode ser fechada, pois ela está com dinheiro");
        } else {
            System.out.printf("A conta de %s foi fechada.\n", getDono());
            setStatus(false);
        }
        
        
    }
    
    public void depositar(double valor) {
        if (isStatus() == false) {
            System.out.printf("Depósito não realizado na conta de %s.\n", getDono());
        } else {
            System.out.printf("Depósito realizado na conta de %s\n", getDono());
            this.saldo += valor;
        }
    }
    
    public void sacar(double valor) {
        if (isStatus() == false || valor > getSaldo()) {
            System.out.printf("Saque não realizado na conta de %s.\n", getDono());
        } 
        else 
            if (isStatus() && valor < getSaldo()){
                System.out.printf("Saque realizado na conta de %s.\n", getDono());
                this.saldo -= valor;
        }
    }
    
    public void pagarMensal() {
        int m = 0;
        if (this.getTipo() == "CC") {
            m = 12;
        } else if (this.getTipo() == "CP") {
            m = 20;
        }
        
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - m);
            System.out.printf("Mensalidade de %s paga.\n", getDono());
        } else {
            System.out.println("Não foi possível pagar a mensalidade.");
        }
        
    }
    
    public void estadoAtual() {
        System.out.println("");
        System.out.println("=================================");
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo() + "R$");
        System.out.println("Status: " + isStatus());
    }
    
    
}
    
