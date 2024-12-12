import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Idade: ");
    int idade = scanner.nextInt();

    switch (idade) {
        case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17:
            System.out.println("Menor de idade");
            break;
        case 18, 19, 20, 21, 22, 23, 24, 25:
            System.out.println("Jovem");
            break;
        case 26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
        41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,
        58,59:
            System.out.println("Adulto");
            break;
        default:
            System.out.println("Idoso");
            break;
    }

    scanner.close();
    }
}