import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int num = reader.nextInt();

        int potencia = 1;

        for (int i = 1; i <= num; i++) {
            int resultado = potencia * 2;
            System.out.println("A potencia de " + i + " na base 2 é: " + resultado);
            potencia = resultado;
        }
        reader.close();
    }
}