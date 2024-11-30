import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner reader = new Scanner (System.in);

        System.out.print("Escreva uma frase: ");
        String frase = reader.nextLine();
        int inicio = 0;
        String palavra;
        String restodaPalavra;
        String maiuscula;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' '){
                palavra = frase.substring(inicio, inicio + 1);
                maiuscula = palavra.toUpperCase();
                restodaPalavra = frase.substring(inicio + 1, i);
                System.out.print(maiuscula + restodaPalavra + " ");
                inicio = i + 1;
            }
            if (i == frase.length() - 1){
                palavra = frase.substring(inicio, inicio + 1);
                maiuscula = palavra.toUpperCase();
                restodaPalavra = frase.substring(inicio + 1, i + 1);
                System.out.print(maiuscula + restodaPalavra);
            }
        }
    }
}