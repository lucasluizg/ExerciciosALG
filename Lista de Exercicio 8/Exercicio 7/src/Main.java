public class Main {
    public static void main(String[] args) {

        int x = 2;
        int i = 1;

        while (i <= 10) {
            int divisor = 2;
            while (x >= divisor) {
                if (x == divisor){
                    System.out.println(x);
                    i++;
                    break;
                }
                if (x % divisor == 0) {
                    break;
                }
                divisor++;
            }
            x++;
        }
    }
}