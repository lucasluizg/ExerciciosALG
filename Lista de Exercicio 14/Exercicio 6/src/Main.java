public class Main {
    public static void main(String[] args) {

        int inteiros[][] = {
                {10, 5},
                {-5, 2},
        };
        int escalar[] = new int[inteiros.length];

        for (int j = 0; j < inteiros.length; j++) {
            int somaEscalar = 1;
            for (int i = 0; i < inteiros.length; i++) {
                somaEscalar = somaEscalar * inteiros[i][j];
            }
            escalar[j] = somaEscalar;
        }

        int resultadoEscalar = 0;

        for (int i = 0; i < escalar.length; i++) {
            resultadoEscalar += escalar[i];
        }
        System.out.print("O resultado é: " + resultadoEscalar);
    }
}