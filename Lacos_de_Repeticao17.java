import java.util.Scanner;

public class Lacos_de_Repeticao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        long fatorial = 1;

        System.out.print("Entre com um número inteiro: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println(num + "! = " + fatorial);
    }
}