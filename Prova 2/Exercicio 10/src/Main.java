public class Main {
    public static void main(String[] args) {

        String input = "  Olá,    mundo!   ";

        String texto = input.toLowerCase();

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

        while (texto.contains("  ")) {
            texto.replace("  ", " ");
        }

        if (texto.charAt(0) == ' ') {
            texto = texto.substring(1);
        }

        if (texto.charAt(texto.length() - 1) == ' ') {
            texto = texto.substring(0, texto.length() - 1);
        }

        String textofinal = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if ((letra >= 'a' && letra <= 'z') || (letra >= '0' && letra <= '9') || letra == ' ') {
                textofinal += letra;
            }
        }
        System.out.print(textofinal);
    }
}