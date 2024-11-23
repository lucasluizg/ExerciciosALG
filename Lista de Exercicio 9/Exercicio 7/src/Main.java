import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = reader.nextInt();

        int caractere = 0;

        for (int i = 0; num >= 1; i++) {
            caractere = num % 10;
            num = num / 10;
            System.out.print(caractere);
        }
        reader.close();
    }
}