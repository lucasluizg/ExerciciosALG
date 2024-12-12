import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Genero: ");
    String genero = scanner.nextLine();

    switch (genero) {
        case "Ação":
            System.out.println("Piratas do século XX");
            break;
        case "Drama":
            System.out.println("Moscou não acredita em lágrimas");
            break;
        case "Comédia":
            System.out.println("Mimino");
            break;
        case "Ficção":
            System.out.println("Solaris");
            break;
        default:
            System.out.println("Gênero inválido");
            break;
    }

    scanner.close();
    }
}