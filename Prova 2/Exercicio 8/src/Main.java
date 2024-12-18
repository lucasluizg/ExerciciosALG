import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite o preco: ");
        double preco = reader.nextDouble();
        System.out.print("Digite o desconto: ");
        double desconto = reader.nextDouble();

        System.out.print("Preço final: ");
        double precofinal = preco * (1 - (desconto / 100));

        System.out.print(precofinal);
    }
}