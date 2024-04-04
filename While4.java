import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o número de estudantes: ");
        int numeerodeestudantes = scanner.nextInt();

        int notatotal = 0;

        for (int i = 0; i < numeerodeestudantes; i++) {
            System.out.print("Digite a nota do estudante " + (i + 1) + ": ");
            int nota = scanner.nextInt();
            notatotal += nota;
        }

        scanner.close();

        float media = (float) notatotal / numeerodeestudantes;
        System.out.println("A média é: " + media);
    }
}