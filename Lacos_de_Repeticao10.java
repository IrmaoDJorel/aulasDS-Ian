import java.util.Scanner;

public class Lacos_de_Repeticao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Entre com um valor N (N > 0): ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}