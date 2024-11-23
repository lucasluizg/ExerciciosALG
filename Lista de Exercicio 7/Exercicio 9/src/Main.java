import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String mes = scanner.nextLine();
    System.out.println("Mês: " + mes);

    switch (mes){
        case "janeiro", "março", "maio", "julho", "agosto", "outubro", "dezembro":
            System.out.println("Esse mês tem 31 dias.");
            break;
        case "abril", "junho", "setembro", "novembro":
            System.out.println("Esse mês tem 30 dias.");
            break;
        case "fevereiro":
            System.out.println("Esse mês tem 28 dias");
            break;
    }

    scanner.close();
    }
}