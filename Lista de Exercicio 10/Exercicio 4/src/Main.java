import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int numero = reader.nextInt();

        for (int i = 1; i < numero; i++){
            if (numero % i == 0 && i % 2 == 0){
                System.out.println(i);
            }
        }
        reader.close();
    }
}