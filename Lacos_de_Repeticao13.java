import java.util.Scanner;

public class Lacos_de_Repeticao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Entre com um valor inteiro entre 1 e 10: ");
            valor = scanner.nextInt();

        } while (valor < 1 || valor > 10);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", valor, i, valor * i);
        }
    }
}