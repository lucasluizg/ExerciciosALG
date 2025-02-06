public class Main {
    public static void main(String[] args) {

        int matriz1[][] = {
                {1, 5},
                {3, 2},
        };

        int matriz2[][] = {
                {4, 8},
                {7, 0},
        };

        int matrizMultiplicacao[] = new int [matriz1.length + matriz2.length];

        for (int i = 0; i < matriz1.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz2[i].length; j++) {
                soma += matriz1[i][j] * matriz2[j][i];
                matrizMultiplicacao[i] = soma;
            }
        }

        for (int i = 0; i < matrizMultiplicacao.length; i++) {
            for (int j = 0; j < matrizMultiplicacao.length; j++) {
                System.out.print(matrizMultiplicacao[i] + " ");
                break;
            }
            System.out.println();
        }
    }
}