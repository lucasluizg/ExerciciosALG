import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra1 = reader.next().charAt(0);

        System.out.print("Digite outra letra: ");
        char letra2 = reader.next().charAt(0);

        for (char i = letra1; i <= letra2; i++) {
            System.out.println(i);
        }
        reader.close();
    }
}