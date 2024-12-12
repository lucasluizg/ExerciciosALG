import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = scanner.nextInt();

        int fatorial = numero;
        int numeroprint = numero;

        while (numero != 1){
            numero--;
            fatorial = fatorial * numero;
        }
        System.out.println("O fatorial do número " + numeroprint + " é : " + fatorial);
    }
}