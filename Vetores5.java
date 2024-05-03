import java.util.Scanner;

public class Vetores5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int indice = 0;

        System.out.println("Digite 10 valores:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                B[i] = A[i] * 5;
            } else {
                B[i] = A[i] + 5;
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < 10; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nMatriz B:");
        for (int i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }
    }
}