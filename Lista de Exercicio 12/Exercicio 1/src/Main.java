public class Main {
    public static void main(String[] args) {

        String texto = "    Eu  adoro estudar   ALG!    ";

        while (texto.contains("  ")) {
            texto = texto.replace("  ", " ");
        }

        if (texto.charAt(0) == ' '){
            texto = texto.substring(1);
        }

        if (texto.charAt(texto.length() - 1) == ' '){
            texto = texto.substring(0, texto.length() - 1);
        }

        System.out.println(texto);
    }
}