import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int array[] = {10, 15, 23, 37, 46, 87, 113, 225, 389, 570};
        buscaBinaria(array);

    }

    static void buscaBinaria(int array[]) {

        int escolhido = 46;

        int menor = array[0];
        int maior = array[0];

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int numero = sc.nextInt();

        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            } else if (array[i] > maior) {
                maior = array[i];
            }
        }

        while (numero != escolhido) {
            for (int i = 0; i < array.length; i++) {
                if (numero < escolhido) {
                    menor = numero + 1;
                    System.out.println("O número é maior ou igual que " + menor + " e menor ou igual que " + maior);
                    System.out.print("Digite um valor: ");
                    numero = sc.nextInt();
                } else if (numero > escolhido) {
                    maior = numero - 1;
                    System.out.println("O número é maior ou igual que " + menor + " e menor ou igual que " + maior);
                    System.out.print("Digite um valor: ");
                    numero = sc.nextInt();
                }
            }
        }

        if (numero == escolhido) {
            System.out.print("Você acertou o número!");
        }

    }
}