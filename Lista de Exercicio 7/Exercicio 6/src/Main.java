import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String dia = scanner.nextLine();
    System.out.println("Dia da semana: " + dia);

    switch (dia){
        case "Domingo":
            System.out.println("Ir para a missa");
            break;
        case "Segunda-feira":
            System.out.println("Visitar a mãe");
            break;
        case "Terça-feira":
            System.out.println("Ir no jiujitsu");
            break;
        case "Quarta-feira":
            System.out.println("Jogar futebol");
            break;
        case "Quinta-feira":
            System.out.println("Correr");
            break;
        case "Sexta-feira":
            System.out.println("Ir no bar");
            break;
        case "Sábado":
            System.out.println("Ver um filme");
            break;
        default:
            System.out.println("Dia inválido");
            break;
    }

    scanner.close();
    }
}