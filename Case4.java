import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do item: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double preco = 0.0;

        switch (codigo) {
            case 100:
                preco = 1.70;
                break;
            case 101:
                preco = 2.30;
                break;
            case 102:
                preco = 2.60;
                break;
            case 103:
                preco = 2.40;
                break;
            case 104:
                preco = 2.50;
                break;
            case 105:
                preco = 1.00;
                break;
            default:
                System.out.println("Código inválido");
                return;
        }

        double precototal = preco * quantidade;

        System.out.printf("O preço total será: R$ %.2f%n", precototal);

        scanner.close();
    }
}