import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char letra = scanner.next().charAt(0);
    System.out.println("Letra: " + letra);

    switch (letra){
        case 'a','e','i','o','u':
            System.out.println("A letra " + letra + " é uma vogal.");
            break;
        default:
            System.out.println("A letra " + letra + " é uma consoante");
            break;
    }

    scanner.close();
    }
}