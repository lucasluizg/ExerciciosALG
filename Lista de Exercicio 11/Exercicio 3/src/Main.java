import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String palavra = reader.nextLine();

        int soma = 0;

        for (int i = 0; i < palavra.length(); i++) {
            switch (palavra.charAt(i)) {
                case 'a', 'e', 'i' , 'o', 'u':
                    soma++;
            }
        }
        System.out.println(soma);
    }
}