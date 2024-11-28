public class Main {
    public static void main(String[] args) {

        String senha = "gasjgsd1213asdsadas32adsas";

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            if (caractere >= '0' && caractere <= '9') {
                System.out.print(caractere);
            }
        }
    }
}