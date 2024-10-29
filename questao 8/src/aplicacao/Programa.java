package aplicacao;

import entidades.Alugar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Alugar> quartos = new ArrayList<>();

        System.out.print("Quantos quartos serao alugados? ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Aluguel #"+(i+1));
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Informe o numero do quarto: ");
            int numQuarto = sc.nextInt();
            quartos.add(new Alugar(numQuarto, nome, email));
            System.out.println();
        }

        quartos.sort(Comparator.comparing(Alugar :: getQuarto));

        System.out.println("Quartos Ocupados: ");
        for (Alugar quartosOcupados : quartos) System.out.println(quartosOcupados);
        sc.close();
    }

}
