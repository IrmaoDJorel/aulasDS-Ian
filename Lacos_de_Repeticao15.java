public class Lacos_de_Repeticao15 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        int contador = 0;

        System.out.print(num1 + " " + num2 + " ");

        while (contador < 98) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
            contador++;
        }
    }
}