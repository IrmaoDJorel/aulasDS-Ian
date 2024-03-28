import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1. Média");
        System.out.println("2. Diferença");
        System.out.println("3. Produto");
        System.out.println("4. Divisão");

        System.out.print("Digite o número da operação: ");
        int operacao = scanner.nextInt();

        double resultado;
        switch (operacao) {
            case 1:
                resultado = (num1 + num2) / 2;
                System.out.printf("A média é: %.2f%n", resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("A diferença é: %.2f%n", resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("O produto é: %.2f%n", resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por 0");
                } else {
                    resultado = num1 / num2;
                    System.out.printf("A divisão é: %.2f%n", resultado);
                }
                break;
            default:
                System.out.println("Número operacional inválido");
                break;
        }

        scanner.close();
    }
}