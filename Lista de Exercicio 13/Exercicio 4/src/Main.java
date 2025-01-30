public class Main {
    public static void main(String[] arg) {

        int numeros[] = {1, 2, 5, 4, 3};
        int maior = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        int segundoMaior = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < maior) {
                if (numeros [i] > segundoMaior) {
                    segundoMaior = numeros[i];
                }
            }
        }
        System.out.print("O segundo maior é: " + segundoMaior);
    }
}