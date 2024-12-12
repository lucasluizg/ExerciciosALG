import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = scanner.nextInt();

        int i = 100;

        if (numero <= 200){
            System.out.println("Número inválido");
        } else {
            while (i <= numero){
                if (i % 2 == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}