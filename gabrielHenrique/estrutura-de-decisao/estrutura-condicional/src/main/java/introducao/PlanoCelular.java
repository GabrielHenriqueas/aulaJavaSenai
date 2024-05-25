package introducao;

import java.util.Scanner;

public class PlanoCelular {
    public static void main(String[] args) {
        /***
         * Uma operadora de telefonia cobra R$ 79.30 por um plano básico que dá direito
         * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
         * custa R$ 2.30. Fazer um programa para ler a quantidade de minutos
         * que uma pessoa consumiu, daí mostrar o valor a ser pago.
         */

        Scanner sc = new Scanner(System.in);

        double valorPlano, minutosExecedidos, tempoLigacao, precoFatura;

        valorPlano = 79.30;
        minutosExecedidos = 2.30;

        System.out.println("Quantos minutos de ligações você efetuou? ");
        tempoLigacao = sc.nextDouble();

        if (tempoLigacao <= 100){
            System.out.printf("O valor da sua fatura desse mês é: %.2f %n", valorPlano);
        }else {
            precoFatura = ((tempoLigacao - 100) * minutosExecedidos) + valorPlano;
            System.out.printf("O valor da sua fatura desse mês é: %.2f %n", precoFatura);
        }
    }
}
