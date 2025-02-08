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

        int matrizMultiplicacao[][] = new int[matriz1.length][matriz2.length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matrizMultiplicacao[i][j] = 0;
                for (int k = 0; k < matriz1.length; k++) {
                    matrizMultiplicacao[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        for (int i = 0; i < matrizMultiplicacao.length; i++) {
            for (int j = 0; j < matrizMultiplicacao[i].length; j++) {
                System.out.print(matrizMultiplicacao[i][j] + " ");
            }
            System.out.println();
        }
    }
}