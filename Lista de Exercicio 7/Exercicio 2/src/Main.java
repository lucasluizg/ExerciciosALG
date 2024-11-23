import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int numero  = scanner.nextInt();
    System.out.println("Número: " + numero);

    switch (numero) {
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda");
            break;
        case 3:
            System.out.println("Terça-feira");
            break;
        case 4:
            System.out.println("Quarta");
            break;
        case 5:
            System.out.println("Quinta");
            break;
        case 6:
            System.out.println("Sexta");
            break;
        case 7:
            System.out.println("Sabado");
            break;
        default:
            System.out.println("Número inválido");
        }

        scanner.close();
    }
}