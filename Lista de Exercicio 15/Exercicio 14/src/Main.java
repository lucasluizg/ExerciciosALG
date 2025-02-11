public class Main {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 10;

        System.out.print(mdc(num1, num2));

    }

    static int mdc (int num1, int num2) {

        int divisor = 1;

        for (int i = 1; i <= num1; i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                divisor = i;
            }
        }
        return divisor;
    }

}