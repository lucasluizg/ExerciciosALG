public class Main {
    public static void main(String[] args) {

        int array[] = {13, 21, 39, 31, 22, 40, 53, 67, 82};
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                cont++;
            }
        }
        System.out.print("Número de ímpares: " + cont);
    }
}