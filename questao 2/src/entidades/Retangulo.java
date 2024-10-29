package entidades;

public class Retangulo {
    private double largura, altura;

    public Retangulo() {
    }

    public Retangulo(double largura, double altura) {
        this.altura = altura;
        this.largura = largura;
    }


    public double getArea() {
        return altura * largura;
    }

    public double getPerimetro() {
        return (largura + altura)* 2;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
