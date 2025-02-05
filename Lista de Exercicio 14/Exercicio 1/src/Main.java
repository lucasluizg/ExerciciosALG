public class Main {
    public static void main(String[] args) {

        double matriz[][] = {
                {10, 20, 30},
                {20, 40, 80},
                {40, 80, 160}
        };
        double matrizSoma[] = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
            matrizSoma[i]= soma;
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matrizSoma[i]);
        }
    }
}