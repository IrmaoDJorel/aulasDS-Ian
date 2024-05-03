import java.util.Scanner;

public class Lacos_de_Repeticao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;

        while (true) {
            System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.print("Nota inválida! Digite novamente: ");
                nota1 = scanner.nextDouble();
            }

            System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.print("Nota inválida! Digite novamente: ");
                nota2 = scanner.nextDouble();
            }

            media = (nota1 + nota2) / 2;
            System.out.printf("Média: %.2f%n", media);
        }
    }
}