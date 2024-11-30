import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva um CPF: ");
        String cpf = reader.nextLine();

        if (cpf.length() == 11){
            for (int i = 0; i < cpf.length(); i++){
                if (i == 2 || i == 5){
                    System.out.print(cpf.charAt(i) + ".");
                } else if (i == 8){
                    System.out.print(cpf.charAt(i) + "-");
                } else {
                    System.out.print(cpf.charAt(i));
                }
            }
        } else {
            System.out.println("CPF invalido");
        }
    }
}