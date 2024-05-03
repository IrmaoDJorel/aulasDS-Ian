import java.util.Scanner;

public class Lacos_de_Repeticao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;
        char resposta;

        do {
            do {
                System.out.print("Entre com a primeira nota do aluno (0-10): ");
                nota1 = scanner.nextDouble();

                if (nota1 < 0 || nota1 > 10)
                    System.out.println("Nota inválida! Entre com uma nota entre 0 e 10");

            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.print("Entre com a segunda nota do aluno (0-10): ");
                nota2 = scanner.nextDouble();

                if (nota2 < 0 || nota2 > 10)
                    System.out.println("Nota inválida! Entre com uma nota entre 0 e 10");

            } while (nota2 < 0 || nota2 > 10);

            media = (nota1 + nota2) / 2;
            System.out.printf("Média: %.2f%n", media);

            do {
                System.out.print("Deseja fazer um novo cálculo? (S/N): ");
                resposta = scanner.next().charAt(0);

            } while (resposta!= 'S' && resposta!= 'N');

        } while (resposta == 'S');

    }
}