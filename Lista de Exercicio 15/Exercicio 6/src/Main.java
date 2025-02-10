import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matriz[] = {8, 17, 31, 53, 78};
        fill(matriz);

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + " ");
        }
    }

    public static void fill(int matriz[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        int posicao = sc.nextInt();
        System.out.print("Substitua por: ");
        int novoNumero = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            if (i == posicao - 1) {
                matriz[i] = novoNumero;
            }
        }
    }
}