import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = read.nextInt();

        int soma = 0;

        for (int i = 0; i < num; i++) {
            num = num / 10;
            soma++;
        }
        System.out.println(soma);
    }
}