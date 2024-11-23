import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int nota1 = scanner.nextInt();
    System.out.println("Nota 1: " + nota1);

    int nota2 = scanner.nextInt();
    System.out.println("Nota 2: " + nota2);

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