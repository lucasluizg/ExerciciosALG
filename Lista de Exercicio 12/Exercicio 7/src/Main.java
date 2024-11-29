import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");
        String input = reader.nextLine();
        String frase = input.toLowerCase();

        int inicio = 0;
        int contagem = 0;
        String palavra;

        System.out.print("Escreva uma palavra: ");
        String input2 = reader.nextLine();
        String igual = input2.toLowerCase();

        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == ' '){
                palavra = frase.substring(inicio, i);
                boolean eIgual = palavra.equals(igual);
                if (eIgual == true){
                    contagem++;
                }
                inicio = i + 1;
            }
            if (i == frase.length() - 1){
                palavra = frase.substring(inicio, i + 1);
                boolean eIgual = palavra.equals(igual);
                if (eIgual == true){
                    contagem++;
                }
            }
        }
        System.out.println(contagem);
    }
}