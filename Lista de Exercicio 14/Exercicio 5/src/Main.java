public class Main {
    public static void main(String[] args) {

        int n = 5;
        int identidade[][] = new int [n][n];

        for (int i = 0; i < identidade.length; i++) {
            for (int j = 0; j < identidade[i].length; j++) {
                if (i == j) {
                    identidade[i][j] = 1;
                } else {
                    identidade [i][j] = 0;
                }
            }
        }
        for (int i = 0; i < identidade.length; i++) {
            for (int j = 0; j < identidade.length; j++) {
                System.out.print(identidade[i][j]);
            }
            System.out.println();
        }
    }
}