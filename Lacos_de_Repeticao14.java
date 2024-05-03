public class Lacos_de_Repeticao14 {
    public static void main(String[] args) {
        double populacaoA = 80000;
        double populacaoB = 200000;
        double taxaCrescimentoA = 0.03;
        double taxaCrescimentoB = 0.015;
        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * taxaCrescimentoA;
            populacaoB += populacaoB * taxaCrescimentoB;
            anos++;
        }

        System.out.println("O país A ultrapassa o país B em " + anos + " anos.");
    }
}