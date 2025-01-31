public class Main {
    public static void main(String[] args) {

        int array [] = {1, 2, 3, 4, 5, 6, 7};
        int invertidos[] = new int[array.length];

        for (int i = 0; i < array.length; i++){
            invertidos[array.length - 1 - i] = array[i];
        }

        for (int i = 0; i < invertidos.length; i++) {
            System.out.print(invertidos[i] + " ");
        }
    }
}