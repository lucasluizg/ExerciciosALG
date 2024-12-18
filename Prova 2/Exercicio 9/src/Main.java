import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = reader.nextLine();

        String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
                + cpf.substring(6, 9) + "-" + cpf.substring(9);

        System.out.print(cpfFormatado);

    }
}