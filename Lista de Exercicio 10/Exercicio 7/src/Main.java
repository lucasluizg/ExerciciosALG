import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = reader.nextInt();

        double soma = 0;
        double serie;

        for (int i = 1; i <= numero; i++){
            serie = 1.0 / i;
            soma += serie;
        }
        System.out.println(soma);
        reader.close();
    }
}