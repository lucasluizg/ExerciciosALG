public class Main {
    public static void main(String[] args) {

        int matriz[] = {10, 15, 8, 20, 31, 40, 23};
        System.out.print(localizaMaior(matriz));

    }

    static int localizaMaior (int matriz[]) {
        int maior = matriz[0];
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i] > maior) {
                maior = matriz[i];
            }
        }
        return maior;
    }
}