public class Main {
    public static void main(String[] args) {

        int num = 1000;
        int invertido, n;

        for (int i = 1; i <= num; i++) {
            invertido = 0;
            n = i;
            while (n != 0){
                invertido = invertido * 10 + n % 10;
                n = n / 10;
            }

            if (invertido == i){
                System.out.println(i);
            }
        }
    }
}