package introducao;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        nota1 = 10;
        nota2 = 2;
        nota3 = 7;

        media = (nota1 +nota2 + nota3) / 3;

        if (media > 7.0){
            System.out.printf("Sua média foi %.1f e você foi APROVADO%n", media);
        }else if (media > 5.0 && media < 7.0){
            System.out.printf("Sua média foi %.1f e você está de RECUPERAÇÃO%n", media);
        }else {
            System.out.printf("Sua média foi %.1f e você foi REPROVADO%n", media);
        }

        System.out.println("Muito obrigado por tirar a média conosco!");

    }
}
