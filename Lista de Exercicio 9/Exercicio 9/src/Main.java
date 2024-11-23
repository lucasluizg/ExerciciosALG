import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = reader.nextInt();

        System.out.print("Digite outro numero: ");
        int num2 = reader.nextInt();

        for (int i = num1; i <= num2; i++) {
            int divisor = 2;
            while (num2 != divisor){
                if (i % divisor == 0){
                    break;
                } else {
                    divisor++;
                }
            }
            if (i == divisor){
                System.out.println(i);
            }
        }
        reader.close();
    }
}