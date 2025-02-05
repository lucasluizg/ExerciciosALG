public class Main {
    public static void main(String[] args) {

        int inteiros[][] = {
                {4, 65, 1, 54},
                {23, 30, 45, 51},
                {3, 178, 81, 101},
                {11, 23, 56, 78}
        };
        int transposta[][] = new int[inteiros[0].length][inteiros.length];

        for (int i = 0; i < inteiros.length; i++) {
            for (int j = 0; j < inteiros[i].length; j++) {
                transposta[i][j] = inteiros[j][i];
            }
        }
}