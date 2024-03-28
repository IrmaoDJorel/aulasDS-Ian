import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double notafinal = (nota1 + nota2) / 2;

        switch ((int) Math.round(notafinal)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("Reprovado");
                break;
            case 5:
            case 6:
            case 7:
                System.out.print("Exame");
                break;
            case 8:
            case 9:
            case 10:
                System.out.print("Aprovado");
                break;
            default:
                System.out.print("Algo está errado, tente denovo");
                break;
        }
        scanner.close();
    }
}