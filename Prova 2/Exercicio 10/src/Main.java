public class Main {
    public static void main(String[] args) {

        String input = " Olá,  mundo! ";

        String texto = input.toLowerCase();

        if (texto.contains("  ")) {
            String textoSemEspaco = texto.replace("  ", " ");
            System.out.print(textoSemEspaco);
        }

        if (texto.charAt(0) == ' ') {
            texto = texto.substring(1);
            String textoSemEspaco = texto.replace(" ", "");
        }

        if (texto.charAt(texto.length() - 1) == ' ') {
            texto = texto.substring(0, texto.length() - 1);
        }

        String textofinal = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if ((letra >= 'a' && letra <= 'z') || (letra >= '0' && letra <= '9')
                    || letra == ' ') {
                textofinal += letra;
            }
        }

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            switch (letra){
                case 'á', 'à', 'â', 'ã':
                    letra = 'a';
                    break;
                case 'é', 'ê':
                    letra = 'e';
                    break;
                case 'í':
                    letra = 'i';
                    break;
                case 'ó', 'ô', 'õ', 'ò':
                    letra = 'o';
                    break;
                case 'ú', 'ù':
                    letra = 'u';
                    break;
            }
        }
    }
}