public class Main {
    public static void main(String[] args){

        String texto = "Java é legal";
        int inicio = 0;

        for (int i = 0; i < texto.length(); i++){
            char caractere = texto.charAt(i);
            if (caractere == ' ') {
                String palavra = texto.substring(inicio, i);
                for (int j = palavra.length() - 1; j >= 0; j--){
                    System.out.print(palavra.charAt(j));
                }
                System.out.print(" ");
                inicio = i + 1;
            }
        }
    }
}