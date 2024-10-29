package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.Empregados;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Empregados> empregados = new ArrayList<>();
        boolean existeId;
        int id;

        System.out.print("Quantos empregados serao cadastrados? ");
        int qtdEmpregados = sc.nextInt();
        System.out.println();

        for (int i = 0; i < qtdEmpregados; i++) {
            System.out.println("Empregado #" + (i + 1));

            do {
                System.out.print("Id: ");
                id = sc.nextInt();
                existeId = false;
                for (Empregados emp : empregados) {
                    if (emp.getId() == id) {
                        existeId = true;
                        System.out.println("Id existete. Tente novamente");
                        break;
                    }
                }
            } while (existeId);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            System.out.println();
            empregados.add(new Empregados(id, nome, salario));
        }

        System.out.println("Informe o ID do funcionario que tera seu salario modificado: ");

        sc.close();
    }

}
