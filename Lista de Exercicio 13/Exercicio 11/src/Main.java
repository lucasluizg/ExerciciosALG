public class Main {
    public static void main(String[] args) {

        int array[] = {1, 2, 4, 4, 5, 6, 7};
        int array2[] = {1, 2, 3, 4, 5, 6, 7};
        boolean igual = true;

        if (array.length == array2.length) {
            for (int i = 0; i < array2.length; i++) {
                if (array[i] != array2[i]) {
                    igual = false;
                    break;
                }
            }
        }

        if (igual) {
            System.out.print("Igual");
        } else {
            System.out.print("Não é igual");
        }
    }
}