import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = scanner.nextInt();

        int divisor = 1;

        if (numero <= 50){
            System.out.println("Número inválido");
        } else {
            while (divisor < numero){
                if (numero % divisor == 0 ){
                    System.out.println(divisor);
                    divisor++;
                    } else {
                        divisor++;
                    }
            }
        }
    }
}