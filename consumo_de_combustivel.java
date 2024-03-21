import java.util.Scanner;
public class consumo_de_combustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva a distância viajada (em quilometros): ");
        double distancia = scanner.nextDouble();

        System.out.print("Escreva o total de combustivel consumido (em litros): ");
        double combustivel = scanner.nextDouble();

        double consumo = distancia / combustivel;

        System.out.printf("O consumo medio foi de: %.2f ", consumo * 100 / distancia);

        scanner.close();
    }
}