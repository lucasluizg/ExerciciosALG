public class Main {
    public static void main(String[] args) {

        int matriz[] = {12, 18, 15, 6};
        System.out.print(mdcMatriz(matriz));
    }

    static int mdc (int num1, int num2) {

        while (num1 != num2){
            if (num1 > num2){
                num1 = num1 - num2;
            } else if (num2 > num1) {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    static int mdcMatriz(int matriz[]) {

        int resultado = matriz[0];

        for (int i = 1; i < matriz.length; i++) {
            resultado = mdc(resultado, matriz[i]);
        }
        return resultado;
    }
}