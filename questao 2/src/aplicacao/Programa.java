package aplicacao;
import java.util.Scanner;
import entidades.Retangulo;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largura, altura;

        System.out.println("Informe a largura e altura do retângulo: ");
        System.out.print("Largura: ");
        largura = sc.nextDouble();
        System.out.print("Altura: ");
        altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println();
        System.out.println("Area: "+ retangulo.getArea());
        System.out.println("Perimetro: "+ retangulo.getPerimetro());
        System.out.println("Diagonal: "+ retangulo.getDiagonal());


        sc.close();
    }

}
