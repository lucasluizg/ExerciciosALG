import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        String array[] = {"Lucas", "Alberto", "Bernardo", "Maria", "Cecilia", "Joana"};
        String nome = "Lucas";

        for (int i = 0; i < array.length; i++) {
            if (array[i] == nome) {
                System.out.print("Está na matriz");
            }
        }
    }
}