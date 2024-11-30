import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");
        String frase = reader.nextLine();
        char anterior = ' ';

        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) != anterior){
                anterior = frase.charAt(i);
                System.out.print(frase.charAt(i));
            }
        }
    }
}