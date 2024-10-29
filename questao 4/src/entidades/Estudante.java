package entidades;

public class Estudante {
    private double nota1, nota2, nota3, notaFinal, faltaram;
    private String nome;

    public Estudante() {

    }

    public Estudante(double nota1, double nota2, double nota3, String nome) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nome = nome;
        calculoNotaFinal();
        aprovacao();
    }

    public void calculoNotaFinal() {
        this.notaFinal = this.nota1 + this.nota2 + this.nota3;
    }

    public boolean aprovacao() {
        if (this.notaFinal >= 60) {
            return true;
        } else {
            this.faltaram = this.notaFinal - 60;
            return false;
        }
    }

    @Override
    public String toString() {
        if (aprovacao() == true) {
            return "Nota final: " + getNotaFinal() + "\nAprovado";
        } else {
            return "Nota final: " + getNotaFinal() + "\nReprovado(a): " + "\nFaltaram: " + getFaltaram();
        }
    }

    public double getFaltaram() {
        return faltaram;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

}
