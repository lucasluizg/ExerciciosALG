import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = reader.nextInt();

        System.out.print("Digite a razão: ");
        int razao = reader.nextInt();

        int soma = numero + razao;

        for (int i = 1; i <= 10; i++) {
            System.out.println(soma);
            numero = soma;
            soma = numero + razao;
        }
        reader.close();
    }
}