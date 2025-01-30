import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int array[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Digite um número: ");
        int numero = reader.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                System.out.print("Sim");
                break;
            }
            if (array[array.length - 1] != numero) {
                System.out.print("Não");
                break;
            }
        }
    }
}