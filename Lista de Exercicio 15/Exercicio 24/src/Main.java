import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int array[] = {10, 15, 23, 37, 46, 87, 113, 225, 389, 570};
        testeBusca(array);

    }

    static void testeBusca(int array[]) {

        boolean crescente = true;
        boolean igual = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    crescente = false;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] != array[j]) {
                    igual = false;
                }
            }
        }

        if (igual) {
            System.out.print("0");
        } else if (crescente) {

            Scanner sc = new Scanner(System.in);
            int escolhido = 46;

            int menor = array[0];
            int maior = array[0];

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
        } else {
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
}