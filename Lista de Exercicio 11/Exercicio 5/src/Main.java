import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String input = reader.nextLine();
        System.out.print("Escreva um símbolo: ");
        String simbolo = reader.nextLine();
        String palavra = input.replace(" ", simbolo);

        System.out.print(palavra);

    }
}