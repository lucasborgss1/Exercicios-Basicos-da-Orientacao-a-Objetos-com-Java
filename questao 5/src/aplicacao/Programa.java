package aplicacao;
import entidades.ConversorMoeda;
import java.util.Scanner;
public class Programa {

    public static void main(String[] args) {
        double precoDolar, qtdCompra;

        Scanner sc = new Scanner(System.in);


        System.out.print("Qual é o preço do dólar? ");
        precoDolar = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        qtdCompra = sc.nextDouble();

        ConversorMoeda conversor = new ConversorMoeda(precoDolar, qtdCompra);

        System.out.println(conversor);
        sc.close();
    }

}
