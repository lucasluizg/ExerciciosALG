public class Main {
    public static void main(String[] args) {

        int inteiros[][] = {
                {4, 65, 1, 54},
                {23, 30, 45, 51},
                {3, 178, 81},
                {11, 23, 56, 78}
        };
        int maior = inteiros[0][0];

        for (int i = 0; i < inteiros.length; i++) {
            for (int j = 0; j < inteiros[i].length; j++) {
                if (inteiros[i][j] > maior) {
                    maior = inteiros[i][j];
                }
            }
        }
        System.out.print(maior);
    }
}