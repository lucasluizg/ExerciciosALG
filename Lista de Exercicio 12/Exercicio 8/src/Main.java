import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");
        String frase = reader.nextLine();

        for (int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if (c >= 'À' && c <= 'Ã'){
                c = 'A';
                System.out.print(c);
            } else if (c >= 'È' && c <= 'Ê'){
                c = 'E';
                System.out.print(c);
            } else if (c >= 'Ì' && c <= 'Î'){
                c = 'I';
                System.out.print(c);
            } else if (c >= 'Ò' && c <= 'Ô'){
                c = 'O';
                System.out.print(c);
            } else if (c >= 'Ù' && c <= 'Û'){
                c = 'U';
                System.out.print(c);
            } else if (c >= 'à' && c <= 'ã'){
                c = 'a';
                System.out.print(c);
            } else if (c >= 'è' && c <= 'ê'){
                c = 'e';
                System.out.print(c);
            } else if (c >= 'ì' && c <= 'î'){
                c = 'i';
                System.out.print(c);
            } else if (c >= 'ò' && c <= 'õ'){
                c = 'o';
                System.out.print(c);
            } else if (c >= 'ù' && c <= 'û'){
                c = 'u';
                System.out.print(c);
            } else {
                System.out.print(c);
            }
        }
    }
}