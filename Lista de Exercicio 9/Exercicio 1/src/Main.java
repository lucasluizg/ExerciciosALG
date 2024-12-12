import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        int num = reader.nextInt();

        for (int i = 0; i <= num; i++) {
            int resultado = i * i;
            System.out.println("Potência quadrada de " + i + " é: " + resultado);
        }
        reader.close();
    }
}