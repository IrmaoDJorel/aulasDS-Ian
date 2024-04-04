import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamnho do quadrado (1-20): ");
        int size = scanner.nextInt();
        scanner.close();

        if (size < 1 || size > 20) {
            System.out.println("Tamanho inválido. Digite tamahos de 1 a 20.");
            return;
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}