import java.util.Scanner;
public class Lacos_de_Repeticao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da 1a. avaliação: ");
        int nota1 = scanner.nextInt();
        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Nota inválida. Digite um novo valor: ");
            nota1 = scanner.nextInt();
        }
        System.out.print("Digite a nota da 2a. avaliação: ");
        int nota2 = scanner.nextInt();
        while (nota2 < 0 || nota2 > 10) {
            System.out.print("Nota inválida. Digite um novo valor: ");
            nota2 = scanner.nextInt();
        }
        int media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno é: " + media);
    }
}