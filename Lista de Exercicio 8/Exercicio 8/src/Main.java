import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = scanner.nextInt();

        int i = 1;

        if (numero <= 100) {
            System.out.println("Número inválido");
        } else {
            while (i < numero) {
                i++;
                System.out.println(i);
            }
        }
    }
}