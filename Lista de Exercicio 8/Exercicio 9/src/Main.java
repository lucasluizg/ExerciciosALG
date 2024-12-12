import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = scanner.nextInt();

        int i = 1;
        int resultado = 0;

        while (i <= 10){
            resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
            i++;
        }
        scanner.close();
    }
}