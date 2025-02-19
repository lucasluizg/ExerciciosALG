import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String array[] = {"Lucas", "Alberto", "Bernardo", "Maria", "Cecilia", "Joana"};
        System.out.print("Digite um nome: ");
        String nome = sc.next();
        boolean encontrou = false;

        for (int i = 0; i < array.length; i++) {
            if (nome.equalsIgnoreCase(array[i])) {
                encontrou = true;
                break;
            }
        }

        if (encontrou) {
            System.out.println("O nome da matriz é: " + nome);
        } else {
            System.out.println("O nome não está na matriz.");
        }
    }
}