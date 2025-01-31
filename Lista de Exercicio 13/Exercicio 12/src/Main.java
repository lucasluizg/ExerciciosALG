public class Main {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int reduzido[] = new int[array.length - 1];
        int alvo = 6;
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != alvo) {
                reduzido[j] = array[i];
                j++;
            }
        }

        for (int i = 0; i < reduzido.length; i++) {
            System.out.print(reduzido[i] + " ");
        }
    }
}