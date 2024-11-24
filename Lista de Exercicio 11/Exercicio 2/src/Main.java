import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");

        String palavra = reader.nextLine();
        String novapalavra = palavra.replace(" ", "");

        System.out.println(novapalavra);
    }
}