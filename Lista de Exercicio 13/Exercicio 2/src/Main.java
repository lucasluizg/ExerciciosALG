public class Main {
    public static void main(String[] args) {

        int numeros[] = {10, 20, 40, 80, 200};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        int media = soma / numeros.length;
        System.out.println("MÉDIA: " + media);
    }
}