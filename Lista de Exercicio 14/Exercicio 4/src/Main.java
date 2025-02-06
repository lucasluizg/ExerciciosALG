public class Main {
    public static void main(String[] args) {

        double inteiros[][] = {
                {4, 65, 1, 54},
                {23, 30, 45, 51},
                {3, 178, 81, 101},
                {11, 23, 56, 78}
        };
        double mediaLinha[] = new double[inteiros.length];
        double mediaColuna[] = new double[inteiros.length];

        for (int i = 0; i < mediaLinha.length; i++) {
            double somaLinha = 0;
            for (int j = 0; j < mediaLinha.length; j++) {
                somaLinha += inteiros[i][j];
            }
            mediaLinha[i] = somaLinha / mediaLinha.length;
        }


        for (int j = 0; j < mediaColuna.length; j++) {
            double somaColuna = 0;
            for (int i = 0; i < mediaColuna.length; i++) {
                somaColuna += inteiros[i][j];
            }
            mediaColuna[j] = somaColuna / mediaColuna.length;
        }

        System.out.print("Média das linhas: ");

        for (int i = 0; i < mediaLinha.length; i++) {
            System.out.print(mediaLinha[i] + " ");
        }

        System.out.println();
        System.out.print("Média das colunas: ");

        for (int i = 0; i < mediaColuna.length; i++) {
            System.out.print(mediaColuna[i] + " ");
        }

    }
}