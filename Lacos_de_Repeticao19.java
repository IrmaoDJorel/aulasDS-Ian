import java.util.Scanner;

public class Lacos_de_Repeticao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int menor = 1001;
        int maior = -1;
        int soma = 0;

        System.out.print("Entre com o número de valores (entre 0 e 1000): ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Entre com o valor " + (i + 1) + " (entre 0 e 1000): ");
            int valor = scanner.nextInt();

            if (valor < 0 || valor > 1000) {
                System.out.println("Valor inválido! Entre com um valor entre 0 e 1000.");
                i--;
                continue;
            }

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