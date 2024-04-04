import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 10 números: ");
        int count = 0;
        int max = Integer.MIN_VALUE;
        while (count < 10) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
            count++;
        }
        scanner.close();
        System.out.println("O maior número é: " + max);
    }
}