public class Main {
    public static void main(String[] args) {

        int array[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        testeCrescente(array);

    }

    static void testeCrescente(int array[]) {

        boolean crescente = true;
        boolean igual = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    crescente = false;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] != array[j]) {
                    igual = false;
                }
            }
        }

        if (igual) {
            System.out.print("0");
        } else if (crescente) {
            System.out.print("1");
        } else {
            System.out.print("-1");
        }

    }

}