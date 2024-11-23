import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        int n = reader.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                System.out.println("Divisor: " + i);
            }
        }
        reader.close();
    }
}