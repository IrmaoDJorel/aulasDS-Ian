import java.util.Scanner;

public class Vetores3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        System.out.println("Digite os nomes de 10 pessoas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.next();
        }

        System.out.print("Digite um nome para buscar: ");
        String nomeBuscar = scanner.next();

        boolean achei = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBuscar)) {
                achei = true;
                break;
            }
        }

        if (achei) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }
}