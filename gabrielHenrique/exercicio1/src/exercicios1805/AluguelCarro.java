package exercicios1805;

import java.util.Locale;
import java.util.Scanner;

public class AluguelCarro {
    public static void main(String[] args) {

        /***
         * Escreva um programa que faça o cálculo de aluguel a ser pago ao alugar um carro, onde a cada dia que a pessoa ficar com o carro seja cobrado R$86,75 e a cada KM rodado seja cobrado R$1,23
         *
         * Depois mostre para o usuários as taxas e o valor que ele irá pagar
         */

        Scanner sc = new Scanner(System.in);

        int diaria;
        double km, aluguel;

        System.out.print("Quantos dias você está com o vículo: ");
        diaria = sc.nextInt();

        System.out.print("Quantos KM você percorreu com o veículo: ");
        km = sc.nextDouble();

        aluguel = (diaria * 86.75) + (km * 1.23);

        System.out.printf("O valor a ser pago é de R$ %.2f", aluguel);

        sc.close();

    }
}
