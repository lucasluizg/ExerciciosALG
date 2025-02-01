public class Main {
    public static void main(String[] args) {

        String array[] = {"S", "U", "B", "I", "N", "O", "O", "N", "I", "B", "U", "S"};
        String array2[] = new String[array.length];
        boolean palindromo = true;

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];
            System.out.print(array2[i]);
        }

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != array[i]){
                palindromo = false;
                break;
            }
        }
        System.out.print(palindromo);
    }
}