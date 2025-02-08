import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String palavra = "Armadilha";
        System.out.print(contaCaracteres(palavra));

    }

    static int contaCaracteres(String palavra) {

        Scanner sc = new Scanner(System.in);

        palavra = palavra.toLowerCase();
        System.out.print("Escreva uma letra: ");
        char letra = sc.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
}