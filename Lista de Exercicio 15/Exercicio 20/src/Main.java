import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int array[] = {10, 15, 23, 37, 46, 87, 113, 225, 389, 570};
        buscaLinear(array);

    }

    static void buscaLinear(int array[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        boolean achado = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                achado = true;
                break;
            }
        }

        if (achado) {
            System.out.print("O número achado é: " + numero);
        } else {
            System.out.print("-1");
        }

    }
}