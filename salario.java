import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salario fixo do vendedor:");
        double Salariofixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas (em reais): ");
        double vendas = scanner.nextDouble();

        double comissao = vendas * 0.15;
        double salariototal = Salariofixo + comissao;

        System.out.printf("O salario do %s será: $%.2f%n", nome, salariototal);

        scanner.close();
    }
}