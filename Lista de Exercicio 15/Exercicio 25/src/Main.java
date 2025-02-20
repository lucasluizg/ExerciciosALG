public class Main {
    public static void main(String[] args) {

        double array[] = {15, 10, 23, 37, 46, 87, 113, 225, 389, 570};
        mediana(array);

    }

    static void mediana(double array[]) {

        double variavelMediana = 0;

        if (array.length % 2 == 0) {
            variavelMediana = (array[(array.length / 2)] + array[(array.length / 2) - 1]) / 2;
        } else if (array.length % 2 != 0) {
            variavelMediana = array[array.length / 2];
        }

        System.out.println(variavelMediana);
    }
}