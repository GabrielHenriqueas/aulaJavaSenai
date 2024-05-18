package exercicios1805;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

    public static void main (String[]args){
        /***
         * Crie um programa que calcule a área de um círculo:
         *
         * fórmula: pi.r²
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double pi = 3.1415;
        double raio, area;

        System.out.print("Digite o raio para calcularmos a área: ");
        raio = sc.nextDouble();

        area = pi * (raio * raio);

        System.out.printf("A área do Circulo com o raio de %.2f é igual a %.2f", raio, area);

        sc.close();
    }
}
