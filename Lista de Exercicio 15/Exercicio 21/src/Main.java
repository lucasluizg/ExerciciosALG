public class Main {
    public static void main(String[] args) {

        int array[] = {10, 15, 23, 37, 46, 87, 113, 225, 389, 570};
        testeCrescente(array);

    }

    static void testeCrescente(int array[]) {

        boolean crescente = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    crescente = false;
                }
            }
        }

        if (crescente) {
            System.out.print("O array é crescente.");
        } else {
            System.out.print("O array é descrescente");
        }

    }

}