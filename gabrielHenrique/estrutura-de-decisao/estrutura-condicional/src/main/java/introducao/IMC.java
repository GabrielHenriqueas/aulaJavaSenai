package introducao;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        /***
         * Uma empresa fitness precisa calcular o IMC dos seus colaboradores para
         * saber o que eles precisam colocar na alimentação deles,
         * para isso pediu para você seguir a tabela abaixo para padronização:
         *
         *
         * IMC
         * CLASSIFICAÇÃO
         * < 18,5
         * MAGREZA
         * ENTRE 18,5 E 24,9
         * NORMAL
         * ENTRE 25 E 29,9
         * SOBREPESO
         * ENTRE 30 E 34,9
         * OBESIDADE GRAU 1
         * ENTRE 35 E 39,9
         * OBESIDADE GRAU 2
         * ACIMA DE 40
         * OBESIDADE GRAU 3
         *
         * Fórmula para cálculo: peso / altura²
         */

        Scanner sc = new Scanner(System.in);

        String nome, classificacao;
        double imc, peso, altura;

        System.out.print("Qual é o seu nome? ");
        nome = sc.nextLine();

        System.out.printf("Olá %s, vamos calcular seu IMC %n", nome);
        System.out.print("Informe seu peso: ");
        peso = sc.nextDouble();
        System.out.printf("Agora %s, precisamos da sua altura: ", nome);
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5){
            classificacao = "MAGREZA";
        }else if (imc < 24.9){
            classificacao = "NORMAL";
        }else if (imc < 29.9){
            classificacao = "SOBREPESO";
        }else if (imc < 34.9){
            classificacao = "OBESIDADE GRAU 1";
        }else if (imc < 39.9){
            classificacao = "OBESIDADE GRAU 2";
        }else {
            classificacao = "OBESIDADE GRAU 3";
        }

        System.out.printf("Obrigado por utilizar o programa, seu IMC é igual a %.2f e sua classificação é: %s", imc, classificacao);
    }
}
