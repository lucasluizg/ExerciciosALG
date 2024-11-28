public class Main {
    public static void main(String[] args){

        String texto = "Java é legal";
        String palavra;
        int inicio = 0;

        for (int i = 0; i < texto.length(); i++){
            if (texto.charAt(i) == ' '){
                palavra = texto.substring(inicio, i);
                for (int j = palavra.length() - 1; j >= 0; j--){
                    System.out.print(palavra.charAt(j));
                }
                System.out.print(" ");
                inicio = i + 1;
            }
            if (i == texto.length() - 1){
                palavra = texto.substring(inicio, i + 1);
                for (int j = palavra.length() - 1; j >= 0; j--){
                    System.out.print(palavra.charAt(j));
                }
            }
        }
    }
}