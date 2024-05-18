package exercicios1805;

import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[]args){
        /***
         * Escreva um programa que leia uma temperatura em Graus Celsius e a converta em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F)
         * Depois mostre a conversão para os usuários
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double c, k, re, ra, f;

        System.out.print("Digite a temperatura em Graus Celsius: ");
        c = sc.nextDouble();

        f = (c * 1.8) + 32;
        k = c + 273.15;
        re = c / 1.25;
        ra = c * 1.8 + 491.67;

        System.out.printf("A temperatura %.2f ºC em Fahrenheit é igual a %.2f ºF %n", c, f);
        System.out.printf("A temperatura %.2f ºC em Kelvin é igual a %.2f ºK %n", c, k);
        System.out.printf("A temperatura %.2f ºC em Réaumur é igual a %.2f ºRe %n", c, re);
        System.out.printf("A temperatura %.2f ºC em Rankine é igual a %.2f ºRa %n", c, ra);

        sc.close();
    }
}
