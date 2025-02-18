public class Main {
    public static void main(String[] args) {

        String palavra = "abc";
        String palavraCifrada = cifraCesar(palavra, -3);
        System.out.print(palavraCifrada);

    }

    static String cifraCesar(String texto, int deslocamento) {
        String cifrado = "";

        if (deslocamento < 0) {
            deslocamento = 29;
        }

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            System.out.print((char)((letra - 'a' + deslocamento) % 26 + 'a'));
        }
        return cifrado;
    }

}