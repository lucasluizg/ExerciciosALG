import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = reader.nextInt();

        int anterior = 1;
        int presente = 1;
        int fibonacci = 1;

        for (int i = 1; fibonacci <= numero; i++) {
            System.out.println(fibonacci);
            fibonacci = anterior + presente;
            anterior = presente;
            presente = fibonacci;
        }
        reader.close();
    }
}