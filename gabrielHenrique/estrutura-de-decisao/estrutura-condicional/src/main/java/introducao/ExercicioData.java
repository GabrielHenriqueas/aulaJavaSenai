package introducao;

import java.util.Scanner;

public class ExercicioData {
    public static void main(String[] args) {
        /***
         * Precisando fazer tratamento de datas, uma empresa de
         * celulares precisa que quando a pessoa entre com um número,
         * transforme ele no dia da semana referente:
         * 1 - Domingo
         * 2 - Segunda …
         */

        Scanner sc = new Scanner(System.in);

        int diaSemana;

        do {
        System.out.print("Digite o dia da semana: ");
        diaSemana = sc.nextInt();

            if (diaSemana == 1){
                System.out.println("Hoje é Domingo!");
            }else if (diaSemana == 2){
                System.out.println("Hoje é Segunda-Feira!");
            }else if (diaSemana == 3){
                System.out.println("Hoje é Terça-Feira!");
            }else if (diaSemana == 4){
                System.out.println("Hoje é Quarta-Feira!");
            }else if (diaSemana == 5){
                System.out.println("Hoje é Quinta-Feira!");
            }else if (diaSemana == 6){
                System.out.println("Hoje é Sexta-Feira!");
            }else if (diaSemana == 7){
                System.out.println("Hoje é Sábado-Feira!");
            }else {
                System.out.print("Entrada inválida, digite o valor novamente: ");
            }
        }while (diaSemana < 1 || diaSemana > 6);
    }
}
