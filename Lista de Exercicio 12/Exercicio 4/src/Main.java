import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String palavra = reader.nextLine();
        boolean resultado = true;

        for (int i = 0; i < palavra.length(); i++){
            if ((palavra.charAt(i) >= 'a' && palavra.charAt(i) <= 'z') ||
                    (palavra.charAt(i) >= 'A' && palavra.charAt(i) <= 'Z')) {
                resultado = true;
            } else {
                resultado = false;
                break;
            }
        }
        System.out.print(resultado);
    }
}