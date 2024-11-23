import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = reader.nextInt();

        int soma = 0;

        for (int i = 1; i < numero; i++){
            if (numero % i == 0){
                soma += i;
            }
        }
        System.out.println("Soma dos divisores: " + soma);

        if (soma == numero){
            System.out.println("É um número perfeito.");
        }
        reader.close();
    }
}