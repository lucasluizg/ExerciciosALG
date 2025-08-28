public class Main {
    public static void main(String[] args) {

        String palavra = "stu";
        String palavraCifrada = cifraCesar(palavra, 29);
        System.out.print(palavraCifrada);

    }

    static String cifraCesar(String texto, int deslocamento) {
        String cifrado = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            char novaLetra = ((char)((letra - 'a' + deslocamento) % 26 + 'a'));
            cifrado = cifrado + novaLetra;
        }
        return cifrado;
    }

}