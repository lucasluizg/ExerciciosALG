public class Main {
    public static void main(String[] args) {

        int numeros[] = {11, 31, 29, 81, 10};
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.print("O menor número é: " + menor);
    }
}