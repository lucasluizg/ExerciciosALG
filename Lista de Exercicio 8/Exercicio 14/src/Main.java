import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        System.out.println("Número: " + numero);

        int divisor = 2;

        if (numero < 100) {
            System.out.println("Número inválido");
        } else {
            while (numero >= divisor) {
                if (numero == divisor) {
                    System.out.println("O número " + numero + " é primo.");
                    break;
                }
                if (numero % divisor == 0) {
                    System.out.println("O número " + numero + " não é primo.");
                    break;
                }
                divisor++;
            }
        }
        scanner.close();
    }
}