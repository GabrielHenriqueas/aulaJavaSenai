package introducao;

import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        /***
         * Usando a tabela de informações abaixo, crie um programa que multiplique o preço do item, pela quantidade que o usuário desejar: (Você pode escolher os valores)
         *
         *
         *
         * CÓDIGO
         * ITEM
         * 1
         * Mc Lanche Feliz
         * 15
         * Panqueca
         * 32
         * Waffle
         * 25
         * Chocotone
         * 46
         * Java Coffee
         * 2
         * Wooper
         */

        Scanner sc = new Scanner(System.in);

        double mc, panqueca, waffle, chocotone, javacoffee, whopper;

        mc = 27.90;
        panqueca = 10.55;
        waffle = 8.99;
        chocotone = 15.22;
        javacoffee = 12.30;
        whopper = 15.00;

        System.out.println("||----------||---------------||------------||");
        System.out.println("||  Código  ||     Item      ||    Valor   ||");
        System.out.println("||----------||---------------||------------||");
        System.out.println("||    1     ||Mc Lanche Feliz||   R$27,90  ||");
        System.out.println("||    15    ||    Panqueca   ||   R$10,55  ||");
        System.out.println("||    32    ||     Waffle    ||   R$8,99   ||");
        System.out.println("||    25    ||    Chocotone  ||   R$15,22  ||");
        System.out.println("||    46    ||  Java Coffee  ||   R$12,30  ||");
        System.out.println("||    2     ||     Whopper   ||   R$15,00  ||");
        System.out.println("||----------||---------------||------------||");

        int codigo;

        do {
            System.out.printf("Digite o código do seu pedido: %n");
            codigo = sc.nextInt();
        }while (codigo != 1 && codigo != 15 && codigo != 32 && codigo != 25 && codigo != 46 && codigo != 2);


        System.out.printf("Digite a quantidade: %n");
        int quantidade = sc.nextInt();

            if (codigo == 1) {
                double valor = mc * quantidade;
                System.out.printf("O item Mc Lanche Feliz comprando %d unidades, sairá por R$%.2f", quantidade, valor);
            } else if (codigo == 15) {
                double valor = panqueca * quantidade;
                System.out.printf("O item Panqueca comprando %d unidades, sairá por R$%.2f", quantidade, valor);
            } else if (codigo == 32) {
                double valor = waffle * quantidade;
                System.out.printf("O item Waffle %d unidades, sairá por R$%.2f", quantidade, valor);
            } else if (codigo == 25) {
                double valor = chocotone * quantidade;
                System.out.printf("O item Chocotone comprando %d unidades, sairá por R$%.2f", quantidade, valor);
            } else if (codigo == 46) {
                double valor = javacoffee * quantidade;
                System.out.printf("O item Java Coffee comprando %d unidades, sairá por R$%.2f", quantidade, valor);
            } else  {
                double valor = whopper * quantidade;
                System.out.printf("O item Whopper comprando %d unidades, sairá por R$%.2f", quantidade, valor);
            }

    }
}
