public class Main {
    public static void main(String[] args) {

        String palavra = "aleatoria";
        System.out.print(inverteString(palavra));
    }

    static String inverteString(String palavra) {

        String invertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        System.out.println(invertida);
        return invertida;
    }
}