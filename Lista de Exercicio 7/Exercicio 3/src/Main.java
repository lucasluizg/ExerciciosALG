import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Operação: ");
    char operacao = scanner.next().charAt(0);

    System.out.print("Número 1: ");
    double n1 = scanner.nextDouble();

    System.out.print("Número 2: ");
    double n2 = scanner.nextDouble();

    double resultado = 0;

    switch (operacao) {
        case '+':
            resultado = n1 + n2;
            break;
        case '-':
            resultado = n1 - n2;
            break;
        case '*':
            resultado = n1 * n2;
            break;
        case '/':
            resultado = n1 / n2;
            break;
        default:
            System.out.println("Operação inválida.");
    }

    System.out.println("Resultado: " + resultado);

    }
}