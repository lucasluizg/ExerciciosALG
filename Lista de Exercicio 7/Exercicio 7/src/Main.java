import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nota 1: ");
    int nota1 = scanner.nextInt();

    System.out.print("Nota 2: ");
    int nota2 = scanner.nextInt();

    int media = (nota1 + nota2) / 2;

    System.out.println("Média: " + media);

    switch(media){
        case 0,1,2,3,4,5,6:
            System.out.println("Reprovado");
            break;
        case 7,8,9:
            System.out.println("Aprovado");
            break;
        case 10:
            System.out.println("Aprovado com distinção");
            break;
    }

    scanner.close();
    }
}