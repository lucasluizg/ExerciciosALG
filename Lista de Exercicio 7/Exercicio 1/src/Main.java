import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int numero = scanner.nextInt();
    System.out.println(numero);

    switch (numero) {
        case 1:
            System.out.println("Um");
            break;
        case 2:
            System.out.println("Dois");
            break;
        case 3:
            System.out.println("Três");
            break;
        case 4:
            System.out.println("Quatro");
            break;
        case 5:
            System.out.println("Cinco");
            break;
        default:
            System.out.println("Número inválido");
            break;
        }
    }
}