import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Insira um ano: ");
        int ano1 = reader.nextInt();

        System.out.print("Insira outro ano: ");
        int ano2 = reader.nextInt();

        for (int i = ano1; i <= ano2; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i);
            }
        }
        reader.close();
    }
}