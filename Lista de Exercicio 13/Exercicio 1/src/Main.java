public class Main {
    public static void main(String[] args) {

        int numeros[] = {5, 10, 15, 20, 25};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }
        System.out.print("SOMA: " + soma);
    }
}