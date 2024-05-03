import java.util.Scanner;

public class Vetores1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nNúmeros digitados ao contrário:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}