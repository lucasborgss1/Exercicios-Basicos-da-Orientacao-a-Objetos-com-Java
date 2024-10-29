package entidades;

public class Banco {
    private int numeroConta;
    private String nomeTitular;
    private float saldo;



    public Banco() {
    }

    public Banco(int numeroConta, String nomeTitular, float saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void deposito (float valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void saque (float valorSaque) {
        this.saldo -= 5;
        this.saldo -= valorSaque;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }


    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    @Override
    public String toString() {
        return "Numero da Conta: " + numeroConta + ", Nome do Titular: " + nomeTitular + ", Saldo: R$ " + String.format("%.2f", saldo);
    }
}
