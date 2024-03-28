import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lista de códigos: ");
                System.out.print(System.lineSeparator());
        System.out.print("1");
            System.out.print(System.lineSeparator());
        System.out.print("2,3 ou 4");
            System.out.print(System.lineSeparator());
        System.out.print("5 ou 6");
            System.out.print(System.lineSeparator());
        System.out.print("7");
            System.out.print(System.lineSeparator());
        System.out.print("8 até 15");
            System.out.print(System.lineSeparator());
            System.out.print(System.lineSeparator());

        System.out.print("Digite o código do produto desejado: ");
        int codigo = scanner.nextInt();

        switch (codigo){

            case 1 :
                System.out.print("Seu pruduto está classificado como: Alimento não-perecível");
                break;
            case 2 :
            case 3 :
            case 4 :
                System.out.print("Seu pruduto está classificado como: Alimento");
                break;
            case 5 :
            case 6:
                System.out.print("Seu pruduto está classificado como: Vestuário");
                break;
            case 7:
                System.out.print("Seu pruduto está classificado como: Higiene Pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.print("Seu pruduto está classificado como: Limpeza e Utensílios Domésticos");
                break;
            default :
                System.out.print("Código Inválido, tente outro");

        }


    }
}