import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");
        String frase = reader.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == '.' || c == '!' || c == '?' ||c == ',') {
                c = ' ';
                System.out.print(c);
            } else {
                System.out.print(c);
            }
        }
    }
}