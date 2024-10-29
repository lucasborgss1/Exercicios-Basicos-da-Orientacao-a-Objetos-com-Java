package aplicacao;

import java.util.Scanner;
import entidades.Produto;

public class Programa {

    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int qtdEstoque, add, remove;
        double preco;

        System.out.println("Informe os dados dos produtos: ");
        System.out.println();
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Preço: ");
        preco = sc.nextDouble();
        System.out.print("Quantidade em Estoque: ");
        qtdEstoque = sc.nextInt();

        Produto produto = new Produto(nome,preco,qtdEstoque);


        System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Estoque: "
                + produto.getQtdEstoque() + ", Valor total: " + produto.getValorEstoque());
        System.out.println();
        System.out.print("Informe a quantidade do produto " + produto.getNome() + " a ser adicionado no estoque: ");
        add = sc.nextInt();
        produto.addProduto(add);
        System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Estoque: "
                + produto.getQtdEstoque() + " Valor total: " + produto.getValorEstoque());
        System.out.println();
        System.out.print("Informe a quantidade do produto (" + produto.getNome() + ") a ser removido do estoque: ");
        remove = sc.nextInt();
        produto.removeProduto(remove);
        System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Estoque: "
                + produto.getQtdEstoque() + ", Valor total: " + produto.getValorEstoque());

        sc.close();
    }

}
