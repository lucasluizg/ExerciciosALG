import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String input = reader.nextLine();
        String semespaco = input.replace(" ", "");
        String palavra = semespaco.toLowerCase();

        int esquerda = 0;
        int direita = palavra.length() - 1;

        for (int i = esquerda; i <= direita; i++) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)){
                System.out.println("Não é palíndromo");
                break;
            }
            if (i == direita){
                System.out.println("É um palíndromo");
            }
        }
    }
}