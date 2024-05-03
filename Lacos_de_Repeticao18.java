import java.util.Scanner;

public class Lacos_de_Repeticao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        System.out.print("Entre com o número de valores: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Entre com o valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();

            if (valor < menor) {
                menor = valor;
            }

            if (valor > maior) {
                maior = valor;
            }

            soma += valor;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
    }
}