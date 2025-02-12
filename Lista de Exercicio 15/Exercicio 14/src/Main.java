public class Main {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 3;

        System.out.print(mdc(num1, num2));

    }

    static int mdc (int num1, int num2) {

        while (num1 != num2){
            if (num1 > num2){
                num1 = num1 - num2;
            } else if (num2 > num1) {
                num2 = num2 - num1;
            }
        }

        return num1;
    }

}