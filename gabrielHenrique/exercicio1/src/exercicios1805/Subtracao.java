package exercicios1805;

import java.util.Locale;
import java.util.Scanner;

public class Subtracao {

    public static void main(String[]args){

        /***
         * Crie um programa que subtraia 2 números decimais e mostre o resultado para o usuário no final
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        resultado = num1 - num2;

        System.out.printf("A subtrção de %.2f - %.2f é %.2f", num1, num2, resultado);

        sc.close();

    }
}
