import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int array[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Digite um número: ");
        int numero = reader.nextInt();
        boolean achou = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                achou = true;
                break;
            }
        }

        if (achou) {
            System.out.print("Sim");
        } else {
            System.out.print("Não");
        }
    }
}