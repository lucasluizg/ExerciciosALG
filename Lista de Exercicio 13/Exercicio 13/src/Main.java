public class Main {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int array2[] = {8, 9, 10, 11, 12, 13, 14};
        int arrayfusao[] = new int[(array.length + array2.length)];

        for (int i = 0; i < array.length; i++){
            arrayfusao[i] = array[i];
        }

        for (int i = 0; i < array2.length; i++) {
            arrayfusao[arrayfusao.length - array2.length + i] = array2[i];
        }

        for (int i = 0; i < arrayfusao.length; i++) {
            System.out.print(arrayfusao[i] + " ");
        }

    }
}