package aplicacao;

import java.util.Scanner;
import entidades.Pensionato;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pensionato[] vet = new Pensionato[10];
        int qtdQuartos;

        System.out.print("Quantos quartos serão alugados? ");
        qtdQuartos = sc.nextInt();
        for (int i = 1; i <= qtdQuartos; i++) {
            System.out.println("Aluguel: #" + i);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.println("Informe o numero do quarto: ");
            int quarto = sc.nextInt();
            vet[quarto - 1] = new Pensionato(nome, email);
        }

        System.out.println("Quartos Ocupados: ");

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] != null) {
                System.out.println((i + 1) + ":" + vet[i]);
            }
        }

        sc.close();
    }

}
