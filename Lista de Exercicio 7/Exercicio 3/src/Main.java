import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char operacao = scanner.next().charAt(0);
    System.out.println("Operação: " + operacao);

    double n1 = scanner.nextDouble();
    System.out.println("Número 1: " + n1);

    double n2 = scanner.nextDouble();
    System.out.println("Número 2: " + n2);

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