import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int dataNasc = reader.nextInt();
        int idade = 2024 - dataNasc;

        if (idade <= 18) {
            System.out.print("Menor de idade");
        } else if (idade >= 18) {
            System.out.print("Adulto");
        } else {
            System.out.print("Idoso");
        }
        reader.close();
    }
}