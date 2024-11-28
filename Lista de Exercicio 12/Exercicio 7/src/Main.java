import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        String frase = "casa na casa da casa";

        int inicio = 0;
        int contagem = 0;
        String palavra;
        String igual = "casa";

        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == ' '){
                palavra = frase.substring(inicio, i);
                System.out.println(palavra);
                if (palavra == igual){
                    contagem++;
                }
                inicio = i + 1;
            }
        }
        System.out.println(contagem);
    }
}