package entidades;

public class Funcionario {
    private String nome;
    private float salarioBruto, imposto, salarioLiquido;

    public Funcionario() {
    }

    public Funcionario(String nome, float salarioBruto, float imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
        setSalarioLiquido();
    }

    public void setSalarioLiquido() {
        this.salarioLiquido = this.salarioBruto - this.imposto;
    }

    public void reajusteSalarioLiquido(float percentual) {
        salarioBruto += salarioBruto * (percentual / 100);
        setSalarioLiquido();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
        setSalarioLiquido();
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
        setSalarioLiquido();
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + ", Salario: R$" + String.format("%.2f", getSalarioLiquido());
    }
}
