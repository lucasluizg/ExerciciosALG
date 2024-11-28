import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma sentença: ");
        String sentenca = reader.nextLine();

        for (int i = 0; i < sentenca.length(); i++){
            char c = sentenca.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                c += 32;
                System.out.print(c);
            } else {
                System.out.print(c);
            }
        }
    }
}