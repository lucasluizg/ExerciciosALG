import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = reader.nextLine();

        int tamanho = palavra.length();

        System.out.println(tamanho);

    }
}