public class Main {
    public static void main(String[] args) {

        int matriz[] = {10, 50, 40, 20, 30};
        System.out.print(mdc(matriz));

    }

    static int mdc (int matriz[]) {

        int menor = matriz[0];
        int maior = matriz[0];
        int divisor = 1;

        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i] < menor) {
                menor = matriz[i];
            } else if (matriz[i] > maior) {
                maior = matriz[i];
            }
        }

        int matrizMultiplicacao[] = new int[menor];

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1 ; j <= matrizMultiplicacao.length; j++) {
                if (matriz[i] % j != 0){
                    break;
                } else if (matriz[i] % j == 0) {
                    divisor = i;
                }
            }
        }
        return divisor;
    }
}