import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma sentença: ");
        String input = reader.nextLine();
        String frase = input.toLowerCase();
        String primeiraMaiuscula;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                System.out.print(frase.charAt(i));
            } else if (frase.charAt(i) == ' ') {
                primeiraMaiuscula = frase.substring(i + 1, i + 2);
                primeiraMaiuscula = primeiraMaiuscula.toUpperCase();
                System.out.print(primeiraMaiuscula);
                i++;
            }
        }
    }
}