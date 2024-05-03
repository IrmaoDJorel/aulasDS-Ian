import java.util.Scanner;
public class Lacos_de_Repeticao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int num2 = scanner.nextInt();
        while (num2 == 0) {
            System.out.print("O segundo valor não pode ser zero. Digite um novo valor: ");
            num2 = scanner.nextInt();
        }
        int result = num1 / num2;
        System.out.println("O resultado da divisão é: " + result);
    }
}