public class Main {
    public static void main(String[] args) {

        int array[] = {20, 30};
        int array2[] = {10, 20, 30, 40, 50, 60};

        if (array.length > array2.length) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array[i] == array2[j]) {
                        System.out.print(array2[j] + " ");
                        break;
                    }
                }
            }
        }
        if (array2.length > array.length) {
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array2[i] == array[j]) {
                        System.out.print(array[j] + " ");
                    }
                }
            }
        }

    }
}