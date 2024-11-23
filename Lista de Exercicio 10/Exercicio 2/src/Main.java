import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva um número inicial: ");
        int start = reader.nextInt();

        System.out.print("Escreva um número final: ");
        int end = reader.nextInt();

        for (int i = start; i >= end; i--){
            System.out.println(i);
        }
        reader.close();
    }
}