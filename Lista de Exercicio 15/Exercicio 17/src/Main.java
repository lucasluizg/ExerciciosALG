public class Main {
    public static void main(String[] args) {

        int array[] = {9, 8, 5, 1, 7, 3, 6, 2, 4};
        crescente(array);

    }

    public static void crescente(int array[]) {

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}