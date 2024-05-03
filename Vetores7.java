import java.util.Scanner;

public class Vetores7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temperaturas = new int[365];
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        int abaixoMedia = 0;

        System.out.println("Entre com as temperaturas médias de todos os dias do ano:");
        for (int i = 0; i < 365; i++) {
            System.out.print("Temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextInt();

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }

            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }

            soma += temperaturas[i];
        }

        double media = (double) soma / 365;

        System.out.println("Menor temperatura do ano: " + menor);
        System.out.println("Maior temperatura do ano: " + maior);
        System.out.println("Temperatura média anual: " + media);

        for (int i = 0; i < 365; i++) {
            if (temperaturas[i] < media) {
                abaixoMedia++;
            }
        }

        System.out.println("Número de dias no ano em que a temperatura foi inferior a média anual: " + abaixoMedia);
    }
}