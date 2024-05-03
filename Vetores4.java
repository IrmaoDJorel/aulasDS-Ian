import java.util.Scanner;

public class Vetores4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[20];
        int soma = 0;
        int media;
        int acimaMedia = 0;

        System.out.println("Digite as notas de 20 alunos:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
            soma += notas[i];
        }

        media = soma / 20;

        System.out.println("Média da turma: " + media);

        for (int i = 0; i < 20; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            }
        }

        System.out.println("Número de alunos com nota acima da média: " + acimaMedia);
    }
}