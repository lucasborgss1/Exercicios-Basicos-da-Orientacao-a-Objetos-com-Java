package aplicacao;

import java.util.Scanner;
import entidades.Estudante;

public class Programa {

    public static void main(String[] args) {
        double nota1, nota2, nota3;
        String nome;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os dados do aluno: ");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Nota 1: ");
        nota1 = sc.nextDouble();
        while (nota1 > 30 || nota1 < 0) {
            System.out.println("Informe uma nota entre 0 e 30.");
            nota1 = sc.nextDouble();
        }

        System.out.print("Nota 2: ");
        nota2 = sc.nextDouble();
        while (nota2 > 35 || nota2 < 0) {
            System.out.println("Informe uma nota entre 0 e 35.");
            nota2 = sc.nextDouble();
        }

        System.out.print("Nota 3: ");
        nota3 = sc.nextDouble();
        while (nota3 > 35 || nota3 < 0) {
            System.out.println("Informe uma nota entre 0 e 35.");
            nota3 = sc.nextDouble();
        }

        System.out.println();
        Estudante estudante = new Estudante(nota1, nota2, nota3, nome);

        System.out.println(estudante);

        sc.close();
    }

}
