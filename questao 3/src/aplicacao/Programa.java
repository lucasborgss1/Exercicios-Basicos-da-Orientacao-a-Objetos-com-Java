package aplicacao;

import java.util.Scanner;
import entidades.Funcionario;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float salario, imposto, percentual;

        System.out.println("Informe os dados do funcionário: ");
        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Salario: ");
        salario = sc.nextFloat();

        System.out.print("Imposto: ");
        imposto = sc.nextFloat();

        Funcionario funcionario = new Funcionario(nome, salario, imposto);

        System.out.println(funcionario);

        System.out.println();
        System.out.print("Qual o percentual de aumento do salario? ");
        percentual = sc.nextFloat();
        funcionario.reajusteSalarioLiquido(percentual);
        System.out.println();
        System.out.println("Dados atualizados: ");
        System.out.println(funcionario);

        sc.close();
    }

}
