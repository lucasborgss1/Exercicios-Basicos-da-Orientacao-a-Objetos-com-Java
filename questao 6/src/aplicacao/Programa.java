package aplicacao;

import java.util.Scanner;
import entidades.Banco;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroConta;
        String nomeTitular;
        char verificarDepositoInicial;
        float depositoInicial = 0;

        System.out.print("Informe o numero da Conta: ");
        numeroConta = sc.nextInt();
        System.out.print("Informe o nome do titular da conta: ");
        sc.nextLine();
        nomeTitular = sc.nextLine();
        System.out.print("Havera um deposito inicial? (s/n) ");
        verificarDepositoInicial = sc.next().charAt(0);
        verificarDepositoInicial = Character.toLowerCase(verificarDepositoInicial);
        if (verificarDepositoInicial == 's') {
            System.out.print("Informe o valor do deposito inicial: ");
            depositoInicial = sc.nextFloat();
        }

        Banco novaConta = new Banco(numeroConta, nomeTitular, depositoInicial);
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(novaConta);

        System.out.println();
        System.out.print("Informe um valor de Deposito: ");
        novaConta.deposito(sc.nextFloat());

        System.out.println();
        System.out.println("Dados da Conta Atualizados: ");
        System.out.println(novaConta);

        System.out.println();
        System.out.print("Informe um valor de Saque: ");
        novaConta.saque(sc.nextFloat());

        System.out.println();
        System.out.println("Dados da Conta Atualizados: ");
        System.out.println(novaConta);

        sc.close();
    }

}
