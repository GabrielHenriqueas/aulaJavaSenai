package exercicios1805;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {

        /***
         * Escreva um programa que a pessoa entre com o ano atual
         * e depois entre com o ano que nasceu, e mostre a idade dele.
         */

        Scanner sc = new Scanner(System.in);
        LocalDate data = LocalDate.now();

        int dataNascimento, dataAtual, idade;

        System.out.print("Digite seu ano de nascimento: ");
        dataNascimento = sc.nextInt();

        dataAtual = LocalDate.now().getYear();

        idade = dataAtual - dataNascimento;

        System.out.printf("Com a data atual %s você tem %d anos", data, idade);
    }
}
