package exercicios1805;

import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, curso, ra;
        byte idade;
        char genero;

        System.out.print("Digite seu nome para cadastro: ");
        nome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        idade = sc.nextByte();

        System.out.println("Digite seu gênero: [M/F]");
        genero = sc.nextLine();

        System.out.print("Digite seu curso: ");

        System.out.printf("Seu Nome é %d ");
    }
}
