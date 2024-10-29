package entidades;

public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Produto() {
    }

    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public double getValorEstoque() {
        return preco * qtdEstoque;
    }

    public void removeProduto(int qtdEstoque) {
        if (this.qtdEstoque > qtdEstoque) {
            this.qtdEstoque -= qtdEstoque;
        } else {
            System.out.println("A solicitação excede o estoque atual!");
        }

    }


    public void addProduto(int qtdEstoque) {
        this.qtdEstoque += qtdEstoque;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public int getQtdEstoque() {
        return qtdEstoque;
    }


    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}
