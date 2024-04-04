import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 10 números: ");
        int count = 0;
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        while (count < 10) {
            int num = scanner.nextInt();
            if (num > num1) {
                num2 = num1;
                num1 = num;
            } else if (num > num2 && num < num1) {
                num2 = num;
            }
            count++;
        }
        scanner.close();
        System.out.println("Os dois maiores números são: " + num1 + " e " + num2);
    }
}