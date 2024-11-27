public class Main {
    public static void main(String[] args){

    String texto = "Olá Mundo Java Meu Amigo";
    int palavras = 0;
    boolean novaPalavra = true;

        for (int i = 0; i<texto.length(); i++){
            char caractere = texto.charAt(i);
            if (novaPalavra && caractere >= 'A' && caractere <= 'Z'){
                palavras++;
                novaPalavra = false;
            } else if (caractere == ' '){
                novaPalavra = true;
            } else {
                novaPalavra = false;
            }
        }
        System.out.println(palavras);
   }
}