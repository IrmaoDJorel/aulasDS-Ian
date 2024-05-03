import java.util.Scanner;

public class Vetores6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.print("Entre com o tamanho dos vetores: ");
        N = scanner.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] Soma = new int[N];

        System.out.println("Entre com os elementos do vetor A:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Entre com os elementos do vetor B:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            Soma[i] = A[i] + B[i];
        }

        System.out.println("Vetor Soma:");
        for (int i = 0; i < N; i++) {
            System.out.print(Soma[i] + " ");
        }
    }
}