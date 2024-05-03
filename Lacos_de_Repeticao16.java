public class Lacos_de_Repeticao16 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.print(num1 + " " + num2 + " ");

        while (num2 < 500) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}