import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque um número inteiro: ");
        int input = scanner.nextInt();
        scanner.close();

        System.out.println("Números pares até " + input + ":");
        for (int i = 2; i <= input; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nNúmeros ímpares até" + input + ":");
        for (int i = 1; i <= input; i += 2) {
            System.out.print(i + " ");
        }
    }
}