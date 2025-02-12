public class Main {
    public static void main(String[] args) {

        String palavra = "zyzy";
        String palavraCifrada = cifraCesar(palavra, 3);
        System.out.print(palavraCifrada);

    }

    static String cifraCesar(String texto, int deslocamento) {
        String cifrado = "";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            cifrado += (char) (letra + deslocamento) % 26 + 'a');   
        }
        return cifrado;
    }

}