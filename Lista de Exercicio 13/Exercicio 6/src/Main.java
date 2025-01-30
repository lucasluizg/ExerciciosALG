public class Main {
    public static void main(String[] args) {

        int array[] = {10, 10, 20, 30, 10};
        int numero = 10;
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                cont++;
            }
        }
        System.out.print("Contagem: " + cont);
    }
}