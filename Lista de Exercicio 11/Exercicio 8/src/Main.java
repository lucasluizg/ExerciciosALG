import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String input = reader.nextLine();
        String palavra = input.toLowerCase();

        System.out.print("Escreva outra palavra: ");
        String input2 = reader.nextLine();
        String palavra2 = input2.toLowerCase();

        String teste;

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < palavra2.length(); j++) {
                if (palavra.charAt(i) == palavra2.charAt(j)) {
                    teste = palavra.substring(0, i);
                    System.out.println(teste);
                }
            }
        }
    }
}