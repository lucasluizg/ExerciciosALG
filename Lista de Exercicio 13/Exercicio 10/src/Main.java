import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int array[] = {10, 23, 47, 53, 46, 71, 83, 98};
        System.out.print("Escreva um número: ");
        int numero = reader.nextInt();
        int indice = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                indice = i;
                break;
            }
        }

        if (indice > -1) {
            System.out.print(indice);
        } else {
            System.out.print("Não está na matriz");
        }

    }
}